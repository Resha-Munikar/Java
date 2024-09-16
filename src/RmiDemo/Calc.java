package RmiDemo;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Calc extends Remote{
    public int add(int x, int y) throws RemoteException;
    public int sub(int x, int y) throws RemoteException;
}
