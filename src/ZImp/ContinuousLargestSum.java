package ZImp;
import java.util.*;
public class ContinuousLargestSum {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=scan.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        int big=0;
        for(int i=0;i<arr.length-1;i++){
                sum=arr[i]+arr[i+1];
                if(big<sum){
                    big=sum;
            }
        }
        System.out.println(big);
    }
}
