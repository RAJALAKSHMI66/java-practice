package ZImp;
import java.util.*;
public class bwXandY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the x value");
        int x=scan.nextInt();
        System.out.println("enter the y value");
        int y=scan.nextInt();
        if(x<y){
            int i=0;
            while(i<arr.length){
                if(arr[i]>x&arr[i]<y){
                    System.out.println(arr[i]);
                }
                i++;
            }
        }
        else{
            System.out.println("condition mismatch");
        }

    }
}