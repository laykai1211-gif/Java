package 練習3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReadCSV {
    public static void main(String[] args) {
        // 使用 try-with-resources 確保 reader 與 br 都會被自動關閉
        try (FileReader reader = new FileReader("dir1/ns1hosp.csv");
             BufferedReader br = new BufferedReader(reader)) {
            PrintWriter out = new PrintWriter("dir1/output_Hospital.txt");


            String line;
            int count=0;
            // 跳過 CSV 的標題列（如果你的 CSV 第一行是欄位名稱，可以先讀一行掉）
            // String header = br.readLine();
            out.println("===名單===");
            while ((line = br.readLine()) != null) {
                // split(",") 會將字串拆解成陣列
                String[] data = line.split(",");
                if(data.length>7){
                 String name=data[1];
                 String area=data[2];
                 String addr=data[7];
                    System.out.printf("%s %s %s\n",name,area,addr);
                    out.printf("醫院: %s | 區域: %s | 地址: %s\n", name, area, addr);
                    count++;
                }


                // 使用 printf 進行格式化輸出
                // 注意：如果 CSV 某一行欄位不足，data[7] 可能會丟出 ArrayIndexOutOfBoundsException



//                for(String field:data){
//                    System.out.println(field+"\t");
//                }
//                System.out.println();
            }
            out.println("共處理"+count+"筆資料");
        } catch (Exception e) {
            // 開發階段建議使用 e.printStackTrace()，能看到哪一行出錯
            e.printStackTrace();
        }
    }
}