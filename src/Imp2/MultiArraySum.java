package Imp2;
import java.util.*;
public class MultiArraySum {
    public static void main(String[]args){
        Scanner scan=new Scanner((System.in));
        System.out.println("Enter the number of arrays: ");
        int n=scan.nextInt();
        int[]arr1=new int[n];
        int[]arr2=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
               arr1[i]=scan.nextInt();
            }
        for(int i=0;i<n;i++){
            arr2[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]+arr2[i]+" ");
        }
    }
}
