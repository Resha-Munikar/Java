package UDP;
import java.net.*;
import java.util.*;
public class Server3 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(1234);
            Scanner sc = new Scanner(System.in);
            while(true) {
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf,1024);
                ds.receive(dp);
                String message = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Client :" +message);
                System.out.println("Server:");
                String msg = sc.nextLine();
                DatagramPacket dp1 = new DatagramPacket(msg.getBytes(),msg.length(),dp.getAddress(), dp.getPort());
                ds.send(dp1);
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
