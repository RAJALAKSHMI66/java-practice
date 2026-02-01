package ImpPatterns;
import java.util.*;
public class type9 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //        i=1,num=1
//        i=2,num=2
//        i=3,num=3
//        i=4,num=4
//        i=5,num=5
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n;j++){
                if(i==0||j==0||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }