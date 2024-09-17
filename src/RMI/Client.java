package RMI;
import java.rmi.registry.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Registry rg = LocateRegistry.getRegistry("localhost",1099);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a word : ");
            String word = sc.nextLine();
            Reverse obj = (Reverse)rg.lookup("reverse");
            String result = obj.reverse(word);
            System.out.println("Reverse of the given word : "+ result);
        }catch(Exception e){
            System.out.println("Server failed to proceed "+ e);
        }
    }
}
