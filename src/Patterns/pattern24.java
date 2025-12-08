package Patterns;
import java.util.Scanner;
public class pattern24 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(int i=1;i<=n-'A'+1;i++){
            for(int j=1;j<=n-'A'+1-i;j++){
                System.out.print(" ");
            }
            for(int ch=1;ch<=i;ch++){
                System.out.print((char)(n-i+1));
            }
            System.out.println(" ");
        }
    }
}
