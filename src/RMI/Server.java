package RMI;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args) {
        try {
            ReverseRemote obj = new ReverseRemote();
            Registry rg = LocateRegistry.createRegistry(1099);
            rg.rebind("reverse",obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed to proceed" + e);
        }
    }
}
