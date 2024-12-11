package RmiDemo;
import java.rmi.*;
import java.rmi.server.*;

public class ReverseRemote extends UnicastRemoteObject implements Reverse {
    ReverseRemote() throws RemoteException{
        super();
    }
    public String reverse(String num){
        StringBuilder obj = new StringBuilder(num);
        return obj.reverse().toString();
    }
}
