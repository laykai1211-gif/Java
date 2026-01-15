package 練習3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        try{
            List<String> lines = Files.readAllLines(Paths.get("output.txt"));
            for(String line:lines){
                System.out.println("讀到的一行:"+line);
            }
        }catch (IOException e){
            System.out.println("讀取失敗:"+e.getMessage());
        }
    }
}
