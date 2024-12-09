package Lab2;

import java.util.Scanner;

class MyException1 extends RuntimeException{
     MyException1(String msg){
        super(msg);
    }
}
public class ExceptionDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks :");
        int marks = sc.nextInt();
        try{
            validateMarks(marks);
            System.out.println("Your marks is "+ marks+".");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void validateMarks(int marks){
        if(marks<0){
            throw new MyException1("Marks cant be less than 0.");
        }
    }
}
