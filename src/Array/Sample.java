package Array;
import java.util.*;
public class Sample {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int i;
        System.out.println("Enter the length of string:");
        int m=scan.nextInt();
        int[]k=new int[m];
        System.out.println("enter"+m+"numbers");
        for(i=0;i<m;i++){
            k[i]=scan.nextInt();
        }
        int[]c=new int[k.length];
        for(i=0;i<k.length;i++){
            c[i]=k[i];
        }
        System.out.println(Arrays.toString(c));
    }
}