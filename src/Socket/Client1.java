package Socket;
import java.io.*;

import java.net.*;
        import java.util.*;
public class Client1 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",4444);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            pw.println(name);
            String convertedName = reader.readLine();
            System.out.println("Converted name : "+ convertedName);
            s.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}