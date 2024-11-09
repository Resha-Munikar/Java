package Socket;
import java.io.*;
import java.net.*;
public class Server2 {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            int n1 = Integer.parseInt(reader.readLine());
            int n2 = Integer.parseInt(reader.readLine());
            int sum = n1+n2;
            int diff = n1-n2;
            int mul = n1*n2;
            pw.println(sum);
            pw.println(diff);
            pw.println(mul);
            s.close();
            ss.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
