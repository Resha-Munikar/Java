package Practice;//Program to ask user to enter his/her name and greet them
import  java.util.*;
public class Greet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day.");
    }
}
