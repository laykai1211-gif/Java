package tw.brad.tutor;

import java.net.InetAddress;
import java.net.Socket;

public class Brad54 {

    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getByName("10.0.101.187"), 9999)) {
            ;
            System.out.println("oK");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
