package Lab2;

import java.util.Scanner;

class MyCheckedException extends Exception{
    MyCheckedException(String msg){
        super(msg);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        try{
            validateMarks(marks);
            System.out.println("Your marks is :" + marks);
        } catch (Exception e) {
            System.out.println("Error : "+ e.getMessage());
        }
    }
    static void validateMarks(int marks) throws MyCheckedException{
        if(marks<0){
            throw new MyCheckedException("Marks can't be less than Zero.");
        }
    }
}
