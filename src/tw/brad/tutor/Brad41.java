package tw.brad.tutor;

import java.io.File;
import java.io.IOException;

public class Brad41 {
    // 1. main 方法必須加上 public 才能執行
    public static void main(String[] args) {
        File root = new File(".");
        System.out.println("當前路徑: " + root.getAbsolutePath());

        File dir3 = new File("./dir3");

        // 檢查目錄是否存在，不存在則建立
        if(!dir3.exists()){
            dir3.mkdir();
            System.out.println("dir3 已建立");
        } else {
            System.out.println("dir3 已經存在");
        }

        System.out.println("---");

        File f1 = new File("dir1/file1.txt");
        // 2. createNewFile 是檢查例外 (Checked Exception)，必須放在 try 區塊內
        try {
            if(!f1.exists()){
                if (f1.createNewFile()) {
                    System.out.println("file1.txt 建立成功");
                }
            } else {
                System.out.println("file1.txt 已存在");
            }
        } catch(IOException e) {
            // 3. catch 必須搭配 try 使用
            System.out.println("發生錯誤: " + e.getMessage());
        }
    }
}