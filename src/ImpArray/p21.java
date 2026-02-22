package ImpArray;
import java.util.*;

public class p21 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length of input:");
        int m=scan.nextInt();
        int []arr=new int[m];
        for(int i=0;i<m;i++){
            System.out.println("enter the elemennts of array");
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the number of right rotation needed:");
        int n=scan.nextInt();
        n=n%m;
        for(int i=0;i<n;i++){
            int last=arr[m-1];
            for(int j=m-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
