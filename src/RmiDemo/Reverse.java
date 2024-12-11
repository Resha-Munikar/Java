package RmiDemo;
import java.rmi.*;
public interface Reverse extends Remote {
    public String reverse(String num) throws RemoteException;
}
