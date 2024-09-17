package RMI;
import java.rmi.*;
public interface Reverse extends Remote {
    public String reverse(String w) throws RemoteException;
}
