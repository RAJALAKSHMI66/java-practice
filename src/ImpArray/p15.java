package ImpArray;
import java.util.*;
public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements of array
        System.out.println("Input elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        int []odd=new int[oddcount];
        int[]even=new int[evencount];
        int eodd=0;
        int eeven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[eeven++]=arr[i];
            }
            else{
                odd[eodd++]=arr[i];
            }
        }
        System.out.println("odd");
        for(int i=0;i<odd.length;i++){
            System.out.print(odd[i]);
        }
        System.out.println("even");
        for(int i=0;i<even.length;i++){
            System.out.print(even[i]);
        }
    }

}
