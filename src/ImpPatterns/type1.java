package ImpPatterns;
import java.util.*;
public class type1 {
    public static void main(String[]args){
        System.out.print("Enter any number:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //outer for loop for row
        for(int i=1;i<=n;i++){
            //inner loop for column
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
