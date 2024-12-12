package UDP;

import java.net.*;
public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(5555);
            InetAddress ip = InetAddress.getByName("127.0.0.1");//localhost

            for (int i = 0; i < 3; i++) {
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf, 1024);
                ds.receive(dp);
                String result = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Result from Server: " + result);
            }

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
