package ImpPatterns;
import java.util.*;
public class type7 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
//        i=1,stars=5
//        i=2,stars=4
//        i=3,stars=3
//        i=4,stars=2
//        i=5,stars=1
         for(int i=1;i<=n;i++) {
             for(int j=1;j<=n-i+1;j++){
                 System.out.print("*");
             }
            System.out.println();
         }
        //        i=1,stars=2
//        i=2,stars=3
//        i=3,stars=4
//        i=4,stars=5
         for(int i=1;i<n;i++){
             for(int j=1;j<=i+1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
         }
    }