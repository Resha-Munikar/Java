//Program to show that parents constructor is called by default
class Animal{
    Animal(){
        System.out.println("This is animal.");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("This is dog.");
    }
}
public class ConstructorDemo1 {
    public static void main(String[] args){
        Dog obj = new Dog();
    }
}
