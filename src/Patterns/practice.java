package Patterns;
import java.util.Scanner;
public class practice {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=n;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=n;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
