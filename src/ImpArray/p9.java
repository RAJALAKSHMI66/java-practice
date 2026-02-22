package ImpArray;
import java.util.*;
public class p9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Input array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int visited=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=visited;
                    }
                }
                System.out.println(arr[i]+"=>"+count);
            }
        }
    }
}
