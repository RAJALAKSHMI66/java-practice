package ImpPatterns;

import java.util.*;
public class type6 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
//        i=1,stars=1
//        i=2,stars=2
//        i=3,stars=3
//        i=4,stars=4
//        i=5,stars=5
        //increasing star pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //decreasing pattern
        //        i=1,stars=4,n=5=>n-i=5-1=4
//        i=2,stars=3
//        i=3,stars=2
//        i=4,stars=1
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }