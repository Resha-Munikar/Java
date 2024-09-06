package Practice;//Program to add three numbers
import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Practice.Sum of these three numbers is:");
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }
}
