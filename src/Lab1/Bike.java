package Lab1;

public class Bike {
    int model;
    String colour;
    Bike(){
        model=2024;
        colour="Green";
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        System.out.println("Model : "+obj.model);
        System.out.println("Colour : "+obj.colour);

    }
}
