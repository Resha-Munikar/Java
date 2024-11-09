package Socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class Client2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("localhost",1234);
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();
            pw.println(num1);
            pw.println(num2);
            int sum = Integer.parseInt(reader.readLine());
            int diff = Integer.parseInt(reader.readLine());
            int mul = Integer.parseInt(reader.readLine());
            System.out.println("Sum : "+ sum);
            System.out.println("Difference : "+ diff);
            System.out.println("Product : "+ mul);
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
