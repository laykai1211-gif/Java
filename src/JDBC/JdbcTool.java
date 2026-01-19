package JDBC; // 定義這份檔案所屬的套件名稱為 JDBC

import java.sql.Connection; // 導入連接資料庫所需的類別
import java.sql.DriverManager; // 導入驅動管理類別，用來建立連線
import java.sql.PreparedStatement; // 導入預編譯 SQL 敘述的類別，可防止 SQL 注入
import java.sql.ResultSet; // 導入結果集類別，用來存放查詢出來的資料
import java.util.ArrayList; // 導入動態陣列
import java.util.List; // 導入 List 介面

public class JdbcTool {
    // 定義資料庫連線路徑 (協定:子協定://主機位置:埠號/資料庫名稱)
    private static final String URL = "jdbc:mysql://localhost:3306/iii";
    // 資料庫帳號
    private static final String USER = "root";
    // 資料庫密碼
    private static final String PASSWD = "root";

    /**
     * <T> 代表這是泛型方法，傳回一個裝載 T 類型物件的清單
     * sql: SQL 查詢指令
     * rowMapper: 定義「如何將 ResultSet 的每一列轉成物件」的邏輯物件
     * args: 不定個數參數，對應 SQL 中的問號 (?)
     */
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... args) {
        // 準備一個清單，用來存放最後要回傳的物件結果
        List<T> list = new ArrayList<T>();

        // 使用 try-with-resources 語法，確保 Connection 與 PreparedStatement 執行完會自動關閉
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD); // 建立與資料庫的連線
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // 建立 SQL 執行物件

            // 處理 SQL 中的參數 (例如將問號替換成實際數值)
            for (int i = 0; i < args.length; i++) {
                // JDBC 的 index 從 1 開始計算，所以是 i + 1
                pstmt.setObject(i + 1, args[i]);
            }

            // 執行 SQL 查詢，並獲得結果集 (ResultSet)
            try (ResultSet rs = pstmt.executeQuery()) {
                // 當結果集還有下一列資料時
                while (rs.next()) {
                    // 透過 rowMapper 介面，將目前的這一列資料轉成一個 Java 物件 (T)
                    T item = rowMapper.mapRow(rs);
                    // 將轉換好的物件加入到清單中
                    list.add(item);
                }
            }

        } catch (Exception e) {
            // 若執行過程中發生錯誤，將錯誤訊息印出
            System.out.println(e);
        }

        // 回傳裝滿資料物件的清單
        return list;
    }
}