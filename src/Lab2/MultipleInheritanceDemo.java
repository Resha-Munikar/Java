package Lab2;

interface Dog{
    public void bark();
}
interface Cat{
    public void meow();

}
class Animal implements Dog, Cat{
    public void bark(){
        System.out.println("Dog can bark.");
    }
    public void meow(){
        System.out.println("Cat can meow.");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.bark();
        animal.meow();
    }
}
