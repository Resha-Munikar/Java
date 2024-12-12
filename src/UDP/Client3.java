package UDP;
import java.net.*;
import java.util.*;
public class Client3 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");
            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("Client:");
                String msg = sc.nextLine();
                DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),ip,1234);
                ds.send(dp);
                byte[] buf = new byte[1024];
                DatagramPacket dp1 = new DatagramPacket(buf,1024);
                ds.receive(dp1);
                String message = new String(dp1.getData(), 0, dp1.getLength());
                System.out.println("Server :" +message);
                if(message.equalsIgnoreCase("bye")||(msg.equalsIgnoreCase("bye"))){
                    System.out.println("Connection closed.");
                    break;
                }
            }
            ds.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
