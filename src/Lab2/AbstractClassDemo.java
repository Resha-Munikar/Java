package Lab2;

abstract class Fruit{
    abstract public void display();
}
class Apple extends Fruit{
    public void display(){
        System.out.println("This is Apple.");
    }
}
class Banana extends Apple{
    public void display(){
        System.out.println("This is Banana.");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args){
        Fruit obj;
        obj = new Apple();
        obj.display();
        obj = new Banana();
        obj.display();
    }
}

