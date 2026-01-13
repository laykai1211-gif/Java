package tw.brad.tutor;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Brad60 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://s.yimg.com/ny/api/res/1.2/DxWTr5b1OVk5E2kNoYd.9A--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTYwNDtjZj13ZWJw/https://media.zenfs.com/en/gotv_ctitv_com_tw_678/c2f9ad5bc9fff998053979246a6afb3e");
            URLConnection conn = url.openConnection();

            BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
            byte[]data=bin.readAllBytes();

            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir1/test.jpg"));
            bout.write(data);
            bout.flush();
            bout.close();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
