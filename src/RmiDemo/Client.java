package RmiDemo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry rg = LocateRegistry.getRegistry("localhost",9000);
            Calc obj = (Calc) rg.lookup("add");
            int value = obj.add(5,2);
            System.out.println("Sum : "+ value);
            int result = obj.sub(5,2);
            System.out.println("Difference : "+ result);
        }catch(Exception e){
            System.out.println("Failed to connect to the server "+ e);
        }
    }
}
