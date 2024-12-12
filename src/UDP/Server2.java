package UDP;
import java.net.*;
public class Server2 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(1111);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf,1024);
            ds.receive(dp);
            String message = new String(dp.getData(),0,dp.getLength());
            String[] numbers = message.split(" ");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            int sum = num1+num2;
            String response = "Sum : "+sum;
            DatagramPacket dp1 = new DatagramPacket(response.getBytes(),response.length(),dp.getAddress(),dp.getPort());
            ds.send(dp1);
            ds.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
