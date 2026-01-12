package tw.brad.tutor;

import java.io.File;
import java.io.FileInputStream;

public class Brad43 {
    static void main(String[] args) {
        File source = new File("dir1/file2.txt");
        try {
            FileInputStream fin = new FileInputStream(source);
           byte[]buf = new byte[(int)source.length()];
            fin.read(buf);
            System.out.println(new String(buf));

            fin.close();
//            System.out.println("ok");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

