//Program to create a class User with fields: name, address, email, age.
//Initialize the value by taking it from user
import java.util.*;
class User{
    String name;
    String address;
    String email;
    int age;
    User(String name, String address, String email, int age){
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
    }
}
public class UserDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your address : ");
        String address = sc.nextLine();
        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        User obj = new User(name, address, email, age);
        obj.display();
    }
}
