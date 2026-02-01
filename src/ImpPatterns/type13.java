package ImpPatterns;
import java.util.*;
public class type13 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
//        i=1,star=1,space=4,n=5
//        i=2,star=3,space=3,n=5
//        i=3,star=5,space=2,n=5
//        i=4,star=7,space=1,n=5
//        i=5,star=9,space=0,n=5
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }