package Lab3;

import java.util.Scanner;

class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
}
public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        try{
            validateMarks(marks);
            System.out.println("Your marks is "+ marks);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am always executed.");
        }
    }
    static public void validateMarks(int marks){
        if(marks<0){
            throw new MyException("Error : Marks can't be less than zero");
        }
    }

}
