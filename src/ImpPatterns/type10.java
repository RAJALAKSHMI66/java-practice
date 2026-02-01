package ImpPatterns;
import java.util.*;
public class type10 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    }