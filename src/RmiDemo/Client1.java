package RmiDemo;
import java.rmi.registry.*;
import java.util.*;
public class Client1 {
    public static void main(String[] args) {
        try{
            Registry rg = LocateRegistry.getRegistry("localhost", 1099);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
            String num = sc.nextLine();
            System.out.println("Number :"+ num);
            Reverse obj = (Reverse)rg.lookup("reverse");
            String rev = obj.reverse(num);
            System.out.println("Reverse : "+ rev);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
