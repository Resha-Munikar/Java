package Lab1;//Program to take your name as input and print in uppercase
import java.util.*;
public class UpperCaseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        String name1 = name.toUpperCase();
        System.out.println("Your name in upper case is " + name1);
    }
}
