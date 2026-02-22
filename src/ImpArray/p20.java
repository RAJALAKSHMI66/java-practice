package ImpArray;
import java.util.*;
public class p20 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of input:");
        int m = scan.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("enter the elements of array");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the number of left rotation needed:");
        int n = scan.nextInt();
        n = n % m;
        for(int i=0;i<n;i++){
            int first=arr[0];
            for(int j=0;j<m-1;j++){
                arr[j]=arr[j+1];
            }
            arr[m-1]=first;
        }
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
