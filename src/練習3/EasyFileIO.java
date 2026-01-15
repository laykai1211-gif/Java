package 練習3; // 宣告這份檔案屬於「練習3」這個套件（資料夾管理）

// 匯入處理「輸入輸出錯誤」的類別，檔案讀寫必備
import java.io.File;
import java.io.IOException;
// 匯入處理檔案操作的工具類別（例如寫入、讀取、刪除）
import java.nio.file.Files;
// 匯入處理路徑的工具類別（用來告訴 Java 檔案在哪裡）
import java.nio.file.Paths;
import java.util.List;

public class EasyFileIO {
    public static void main(String[] args) {
        // 定義要寫入檔案的字串內容，\n 代表換行
        String content = "第一行\n第二行";

        try {
            /* 這行是核心動作：
               1. Paths.get("output.txt")：建立一個路徑物件，指向專案根目錄下的 output.txt
               2. content.getBytes()：將字串轉成「位元組陣列」，因為底層儲存是以 Byte 為單位
               3. Files.write(...)：執行寫入動作。如果檔案不存在會自動建立，若存在則直接覆蓋
            */
            Files.write(Paths.get("dir1/output.txt"), content.getBytes());


            // 如果上面那行沒出錯，就會印出這行
            System.out.println("寫入成功");

        } catch (IOException e) {
            // 如果寫入過程發生意外（例如：硬碟空間不足、沒有寫入權限、檔案被其他程式鎖定）
            // 會捕捉到 IOException，並執行以下動作：

            // 在控制台印出詳細的錯誤追蹤訊息（紅字），方便除錯
            e.printStackTrace();
        }
    }
}