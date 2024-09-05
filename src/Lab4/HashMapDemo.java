package Lab4;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        HashMap<String,String> animal = new HashMap<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter your pet type and name : ");
            String name = sc.nextLine();
            arr = name.split(":");
            animal.put(arr[0],arr[1]);
        }
        for(Map.Entry<String,String>entry : animal.entrySet()){
            System.out.println("Key = "+ entry.getKey()+ "  Value = "+entry.getValue());
        }
    }
}
