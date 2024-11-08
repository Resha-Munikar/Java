package Socket;
import java.io.*;
import java.net.*;
public class Server1 {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String name = reader.readLine();
            pw.println("Name in uppercase : "+ name.toUpperCase());
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
