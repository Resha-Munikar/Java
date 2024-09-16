package RmiDemo;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            CalcRemote obj = new CalcRemote();
            Registry rg = LocateRegistry.createRegistry(9000);
            rg.rebind("add", obj);
            rg.rebind("sub", obj);
            System.out.println("Server is ready.");
        }catch(Exception e){
            System.out.println("Server failed "+ e);
        }
    }
}
