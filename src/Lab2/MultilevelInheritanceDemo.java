package Lab2;
import java.util.*;
class Father{
    public void display(){
        System.out.println("This is from father.");
    }
}
class Son extends Father{
    public void display(){
        super.display();
        System.out.println("This is from son.");
    }
}
class Daughter extends Son{
    public void display(){
        super.display();
        System.out.println("This is from daughter.");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args){
        Daughter obj = new Daughter();
        obj.display();
    }
}
