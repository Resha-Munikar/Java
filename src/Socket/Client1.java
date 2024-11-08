package Socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class Client1 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",1234);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw.println("Enter your name : ");
            String name = sc.nextLine();
            pw.println("Name : " + name);
            String convertedName = reader.readLine();
            pw.println("Converted name : "+ convertedName);
            s.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
