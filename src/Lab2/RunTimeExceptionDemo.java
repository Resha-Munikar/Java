package Lab2;
import java.util.*;
class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
}
public class RunTimeExceptionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int a = sc.nextInt();
        System.out.println("Enter a denominator: ");
        int b = sc.nextInt();
        try{
            validateDenominator(b);
            int div = a/b;
            System.out.println(a + " / " + b +" = "+ div);
        }catch(MyException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    static void validateDenominator(int b){
       if(b==0){
           throw new MyException("Denominator cannot be Zero.");
       }
    }
}
