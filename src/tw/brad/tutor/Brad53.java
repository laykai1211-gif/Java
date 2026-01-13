package tw.brad.tutor;

import java.net.*;

public class Brad53 {
    public static void main(String[] args) {
        byte[] buf = new byte[1024];
        try {
            DatagramSocket socket = new DatagramSocket(8888);
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            System.out.println("等待接收 (wait...)...");
            socket.receive(packet);
            socket.close();
            System.out.println("接收成功 (Receive ok)");

            // 1. 從 packet 取得資料
            byte[] data = packet.getData();
            // 2. 取得實際封包長度（避免印出後面多餘的空白 buf）
            int len = packet.getLength();
            // 3. 定義 msg：將 byte 陣列轉成 String
            String msg = new String(data, 0, len);
            // 4. 取得對方的 IP
            String remoteIP = packet.getAddress().getHostAddress();
            // 5. 印出完整結果
            System.out.println("來自 " + remoteIP + " 的訊息：" + msg);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}