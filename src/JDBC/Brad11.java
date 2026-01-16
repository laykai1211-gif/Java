package JDBC;

// 匯入 JDBC 相關類別
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

// 匯入自定義的類別 (加密工具與資料模型)
import JDBC.BCrypt;
import JDBC.Member;

public class Brad11 {
    // 定義資料庫連線資訊：URL、帳號、密碼
    private static final String URL = "jdbc:mysql://localhost:3306/iii";
    private static final Properties prop = new Properties(); // 用於存入連線設定
    private static final String USER = "root";
    private static final String PASSWD = "root";

    // 定義 SQL 指令 (使用 Java 15+ 的 Text Blocks 語法 """ )
    // 登入查詢：透過 Email 找尋會員資料
    private static final String SQL_LOGIN = """
          SELECT id, email, passwd, name
          FROM member
          WHERE email = ?
          """;

    // 修改密碼：根據 ID 更新密碼欄位
    private static final String SQL_CHPASSWD = """
          UPDATE member
          SET passwd = ?
          WHERE id = ?
          """;

    public static void main(String[] args) {
        // 將連線帳密存入 Properties 物件
        prop.put("user", USER);
        prop.put("password", PASSWD);

        // 1. 執行登入邏輯
        Member member = login();

        // 如果登入成功 (回傳的物件不是 null)
        if (member != null) {
            System.out.printf("Welcome, %s\n", member.getName());

            // 2. 登入成功後，嘗試執行修改密碼功能
            boolean isOK = chPasswd(member);
        }
    }

    /**
     * 處理登入邏輯的方法
     * @return 成功回傳 Member 物件，失敗回傳 null
     */
    static Member login() {
        System.out.println("Member Login");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine(); // 取得使用者輸入的 Email
        System.out.print("Password: ");
        String passwd = scanner.nextLine(); // 取得使用者輸入的密碼

        // 使用 try-with-resources 自動關閉資源 (Connection 與 PreparedStatement)
        try(Connection conn = DriverManager.getConnection(URL,prop);
            PreparedStatement pstmt = conn.prepareStatement(SQL_LOGIN)){

            // 填入 SQL 中的第一個問號 (?)：email
            pstmt.setString(1, email);

            // 執行查詢並取得結果集 (ResultSet)
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // 如果找到該 Email，接著使用 BCrypt 比對密碼
                // rs.getString("passwd") 是資料庫裡加密過的雜湊值
                if (BCrypt.checkpw(passwd, rs.getString("passwd"))) {
                    // 比對成功，將資料庫結果包裝成 Member 物件回傳
                    Member member = new Member(
                            rs.getLong("id"),
                            rs.getString("email"),
                            rs.getString("passwd"),
                            rs.getString("name"));
                    return member;
                } else {
                    System.out.println("Login Failure(2)"); // 密碼錯誤
                }
            } else {
                System.out.println("Login Failure(1)"); // 找不到該 Email
            }

        } catch(Exception e) {
            // 印出可能的連線或 SQL 錯誤
            System.out.println(e);
        }

        return null;
    }

    /**
     * 處理修改密碼邏輯的方法
     * @param member 當前登入的會員
     * @return 修改是否成功
     */
    static boolean chPasswd(Member member) {
        String newPasswd="";
        Scanner scanner = new Scanner(System.in); // 放在迴圈外較有效率
        while (true) {
            System.out.println("請輸入新密碼:");
            newPasswd = scanner.nextLine();
            // 使用 BCrypt 檢查：輸入的明文密碼 vs 資料庫現有的雜湊值
            if (BCrypt.checkpw(newPasswd, member.getPasswd())) {
                System.out.println("❌ 不可以與舊密碼一樣，重新輸入");
            } else {
                // 密碼不同，跳出迴圈準備更新
                break;
            }
        }

        // --- 關鍵步驟：將新密碼加密成雜湊字串 ---
        String hashedPasswd = BCrypt.hashpw(newPasswd, BCrypt.gensalt());

        try (Connection conn = DriverManager.getConnection(URL, prop);
             PreparedStatement pstmt = conn.prepareStatement(SQL_CHPASSWD)) {

            pstmt.setString(1, hashedPasswd); // 填入加密後的新密碼
            pstmt.setLong(2, member.getId()); // 填入會員 ID

            int n = pstmt.executeUpdate();    // 執行資料庫更新動作
            if (n > 0) {
                System.out.println("✅ 密碼更改成功！");
                // 記得更新 member 物件內的密碼，否則在同一次執行中再次改密碼會抓到舊的
                member.setPasswd(hashedPasswd);
                return true;
            }
        } catch (Exception e) {
            System.out.println("⚠️ 資料庫更新失敗: " + e);
        }

        return false;
    }
}