package JDBC; // 定義程式所在的包名

// 匯入必要的 IO、網路、SQL 與 JSON 處理類別
import java.io.BufferedInputStream; // 用於高效讀取二進位串流
import java.io.BufferedReader; // (已註解) 用於讀取文字行
import java.io.InputStreamReader; // (已註解) 轉換位元流為字元流
import java.net.URL; // 網址物件
import java.net.URLConnection; // 網路連線物件
import java.sql.Connection; // 資料庫連線物件
import java.sql.DriverManager; // 資料庫驅動管理員
import java.sql.PreparedStatement; // 預編譯 SQL 執行物件
import java.util.Properties; // 儲存連線屬性（帳密）

import org.json.JSONArray; // 處理 JSON 陣列 [ ]
import org.json.JSONObject; // 處理 JSON 物件 { }

public class Brad06 { // 類別名稱
    // 1. 定義政府 OpenData API 的網址
    private static final String URL_OPENDATA = "https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx";
    // 2. 定義資料庫 URL
    private static final String URL = "jdbc:mysql://localhost:3306/iii";
    // 3. 定義資料庫帳號
    private static final String USER = "root";
    // 4. 定義資料庫密碼
    private static final String PASSWD = "root";

    // 5. SQL 範本：插入資料到 gift 表格
    private static final String SQL_INSERT = """
          INSERT INTO gift
             (name,feature,addr,tel,picurl,lat,lng)
          VALUES
             (?,?,?,?,?,?,?)
          """;
    // 6. SQL 範本：刪除 gift 表格內的所有資料
    private static final String SQL_DEL_ALL = """
          DELETE FROM gift
          """;
    // 7. SQL 範本：將自動遞增 (AI) 的計數器歸零（從 1 開始）
    private static final String SQL_ONE = """
          ALTER TABLE gift AUTO_INCREMENT = 1
          """;

    public static void main(String[] args) { // 程式主入口
        String json; // 宣告儲存 JSON 的字串
        try { // 偵測異常
            json = fetchFromURL(URL_OPENDATA); // 第一步：下載資料
            parseJSON(json); // 第二步：解析並存入資料庫
            System.out.println("Finish"); // 完成後印出提示
        } catch (Exception e) { // 捕捉錯誤
            System.out.println(e); // 印出錯誤原因
        }
    }

    // 抓取網頁內容的方法
    static String fetchFromURL(String url) throws Exception {
        URL target = new URL(url); // 建立 URL 物件
        URLConnection conn = target.openConnection(); // 開啟連線

        // 使用 BufferedInputStream 一次讀取所有位元
        try(BufferedInputStream bin =
                    new BufferedInputStream(conn.getInputStream())){
            byte[] data = bin.readAllBytes(); // 讀取所有的 Byte 資料
            return new String(data); // 將 Byte 陣列轉成字串回傳
        }
    }

    // 解析 JSON 並存入資料庫的方法
    static void parseJSON(String json) throws Exception{
        JSONArray root = new JSONArray(json); // 將字串轉成 JSON 陣列
        System.out.println(root.length()); // 印出抓到了幾筆資料

        Properties prop = new Properties(); // 建立屬性集合
        prop.put("user", USER); // 設定帳號
        prop.put("password", PASSWD); // 設定密碼

        // 建立連線與預編譯執行物件 (try-with-resources 會自動關閉資源)
        try (Connection conn = DriverManager.getConnection(URL, prop);
             PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT)){

            pstmt.execute(SQL_DEL_ALL); // 執行 SQL：清空表格
            pstmt.execute(SQL_ONE); // 執行 SQL：重設自動遞增編號

            // 開始巡覽 JSON 陣列中的每一筆物件
            for (int i=0; i<root.length(); i++) {
                JSONObject row = root.getJSONObject(i); // 取得第 i 筆 JSON 物件

                // 提取欄位資料
                String name = row.getString("Name"); // 取得名稱
                String feature = row.getString("Feature"); // 取得特色
                // 拼接地址：縣市 + 鄉鎮 + 銷售地點
                String addr = row.getString("County") +
                        row.getString("Township") +
                        row.getString("SalePlace");
                String tel = row.getString("ContactTel"); // 取得電話
                String picurl = row.getString("Column1"); // 取得圖片網址
                String lat = row.getString("Latitude"); // 取得緯度字串
                String lng = row.getString("Longitude"); // 取得經度字串

                // 設定 SQL 插入參數 (對應 1 到 5 個問號)
                pstmt.setString(1, name);
                pstmt.setString(2, feature);
                pstmt.setString(3, addr);
                pstmt.setString(4, tel);
                pstmt.setString(5, picurl);

                // 處理經緯度轉換，避免字串不是數字格式導致程式崩潰
                try {
                    pstmt.setDouble(6, Double.parseDouble(lat)); // 轉成 Double 並設定第 6 個問號
                    pstmt.setDouble(7, Double.parseDouble(lng)); // 轉成 Double 並設定第 7 個問號
                } catch(Exception e) {
                    pstmt.setDouble(6, 0.0); // 轉換失敗則存入 0.0
                    pstmt.setDouble(7, 0.0); // 轉換失敗則存入 0.0
                }

                pstmt.executeUpdate(); // 正式執行該筆資料的插入
            } // 迴圈結束
        } // 連線與執行物件自動關閉
    }
}