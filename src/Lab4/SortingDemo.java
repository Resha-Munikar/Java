package Lab4;
import java.util.*;
public class SortingDemo {
    public static void main(String[] args) {
        String[] names = {"Resha","Aakash","Prahina","Rashika"};
        System.out.println("Before sorting:");
        for(int i=0; i<4; i++){
            System.out.println(names[i]);
        }
        String temp;
        for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                if(names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in alphabetical order:");
        for(int i=0; i<4; i++){
            System.out.println(names[i]);
        }
    }
}
