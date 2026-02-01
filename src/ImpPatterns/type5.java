package ImpPatterns;
import java.util.*;
public class type5 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
//        i=1,num=5
//        i=2,num=4
//        i=3,num=3
//        i=4,num=2
//        i=5,num=1
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    }