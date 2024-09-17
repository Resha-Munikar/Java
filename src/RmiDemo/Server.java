package RmiDemo;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try{
            CalcRemote obj = new CalcRemote();
            Registry rg = LocateRegistry.createRegistry(9000);
            rg.rebind("add", obj);
            System.out.println("Server is ready.");
        }catch(Exception e){
            System.out.println("Server failed "+ e);
        }
    }
}
