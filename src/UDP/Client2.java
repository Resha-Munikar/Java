package UDP;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();
            String message = num1+" "+ num2;
            DatagramPacket dp = new DatagramPacket(message.getBytes(),message.length(),ip,1111);
            ds.send(dp);
            byte[] buf = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(buf, 1024);
            ds.receive(dp1);
            String receive = new String(dp1.getData(),0,dp1.getLength());
            System.out.println(receive);
            ds.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
