package UDP;
import java.net.*;
public class Server1 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(1234);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf,1024);
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength());
            System.out.println(str);
            ds.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
