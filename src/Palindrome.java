//Program to input a number from user and check if it is palindrome or not
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum =0;
        while(num>0){
            int r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
        if(temp == sum){
            System.out.println(temp + " is palindrome.");
        }
        else{
            System.out.println(temp + " is not palindrome.");
        }
    }
}
