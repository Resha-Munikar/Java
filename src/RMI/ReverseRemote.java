package RMI;
import java.rmi.*;
import java.rmi.server.*;
public class ReverseRemote extends UnicastRemoteObject implements Reverse{
    ReverseRemote() throws RemoteException{
        super();
    }
    public String reverse(String w){
        StringBuilder b = new StringBuilder(w);
        return b.reverse().toString();
    }
}
