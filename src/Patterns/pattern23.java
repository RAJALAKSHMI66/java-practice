package Patterns;
import java.util.Scanner;
public class pattern23 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=(n-i+1);j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
