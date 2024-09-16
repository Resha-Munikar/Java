package RmiDemo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcRemote extends UnicastRemoteObject implements Calc {
    CalcRemote() throws RemoteException{
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return (x+y);
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return (x-y);
    }
}
