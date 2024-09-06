package Practice;//Program to calculate percentage of a student
import java.util.*;
public class Percentage {
    public static void main(String[] args){
        float total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in english : ");
        float english = sc.nextFloat();
        System.out.println("Enter marks in nepali : ");
        float nepali = sc.nextFloat();
        System.out.println("Enter marks in math : ");
        float math = sc.nextFloat();
        System.out.println("Enter marks in social : ");
        float social = sc.nextFloat();
        System.out.println("Enter marks in account : ");
        float account = sc.nextFloat();
        total = english+nepali+math+social+account;
        percentage = (total/500)*100;
        System.out.println("Total marks : "+ total);
        System.out.println("Practice.Percentage : "+ percentage + "%");

    }
}
