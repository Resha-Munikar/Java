//Program to create a class Car and its child class Tesla and illustrate constructor chaining.
class Car{
    String colour;
    int model;
    Car(String colour, int model){
        this.colour = colour;
        this.model = model;
    }
}
class Tesla extends Car{
    Boolean electric;
    Tesla(String colour, int model, Boolean electric){
        super(colour,model);
        this.electric = electric;
    }
    void display(){
        System.out.println("Colour : " + colour);
        System.out.println("Model : " + model);
        System.out.println("Electric : " + electric);
    }
}
public class ConstructorDemo {
    public static void main(String[] args){
        Tesla obj = new Tesla("Blue",2023,true);
        obj.display();
    }
}
