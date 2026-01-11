package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad45 {
    static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            FileInputStream fin = new FileInputStream("dir1/pic.jpg");
            FileOutputStream fout = new FileOutputStream("dir1/pic.jpg");
            int len;
            byte[] buf = new byte[4 * 1024];
            while ((len = fin.read()) != -1) {
                fout.write(buf, 0, len);
            }
            fout.flush();
            fout.close();
            fin.close();
            long time = System.currentTimeMillis() - start;
            System.out.println("ok" + time);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
