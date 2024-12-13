package Filehandling;
import java.io.*;
import java.util.*;
class Student implements Serializable{
    int id;
    String name;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id : ");
        int id = sc.nextInt();
        this.id = id;
        sc.nextLine();
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        this.name=name;
    }
    void display(){
        System.out.println("Id : "+id+" "+"Name : "+name);
    }
}
public class ReadWriteDemo{
    public static void main(String[] args) {
        try(
            FileOutputStream fout = new FileOutputStream("file1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout)){
            for(int i=0; i<5;i++){
                Student obj = new Student();
                obj.input();
                out.writeObject(obj);
            }
        }catch(Exception e){
            System.out.println("Error");
        }

        try(
            FileInputStream fin = new FileInputStream("file1.txt");
            ObjectInputStream in = new ObjectInputStream(fin)){
            for(int i=0;i<5;i++){
                Student obj1 = (Student) in.readObject();
                obj1.display();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
