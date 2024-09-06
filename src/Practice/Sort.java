package Practice;//Program to input numbers from user and sorting it
import java.util.*;
public class Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("After sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
