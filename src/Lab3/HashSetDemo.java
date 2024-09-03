package Lab3;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> student = new HashSet<>();
        for(int i=1; i<=5; i++){
            System.out.println("Enter name "+ i +": ");
            String name = sc.nextLine();
            student.add(name);
        }
        System.out.println(student);
    }
}
