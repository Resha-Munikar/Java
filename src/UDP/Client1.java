package UDP;
import java.net.*;
import java.util.*;
public class Client1 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a message : ");
            String str = sc.nextLine();
            DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),address,1234);
            ds.send(dp);
            ds.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
