package Patterns;
import java.util.Scanner;
public class pattern27 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1,p=1;i<=n;i++,p+=2){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(p);
            }
            for(int j=1;j<=i;j++){
                System.out.print(p);
            }
            System.out.println(" ");
        }
    }
}
