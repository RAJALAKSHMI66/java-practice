package Patterns;
import java.util.Scanner;
public class pattern25 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(int i=1;i<=n-'A'+1;i++){
            for(int j=1;j<=n-'A'+1-i;j++){
                System.out.print(" ");
            }
            for (char ch = n; ch >= n - i + 1; ch--) {
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
