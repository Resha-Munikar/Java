package Lab4;
import java.util.*;
public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev ="";
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        int len = word.length();
        for(int i=len-1; i>=0; i--){
            rev += word.charAt(i);
        }
        if(word.equals(rev)){
            System.out.println(word+" is palindrome.");
        }
        else{
            System.out.println(word+" is not palindrome.");
        }
    }
}
