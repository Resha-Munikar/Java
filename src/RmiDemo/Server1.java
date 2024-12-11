package RmiDemo;
import java.rmi.*;
import java.rmi.registry.*;
public class Server1 {
    public static void main(String[] args){
        try{
            ReverseRemote obj = new ReverseRemote();
            Registry rg = LocateRegistry.createRegistry(1099);
            rg.rebind("reverse",obj);
            System.out.println("Server is running");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
