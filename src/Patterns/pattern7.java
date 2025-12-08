package Patterns;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        for (char ch =n;ch >='A'; ch--) {
            for(int i=0;i<(n-'A'+1);i++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
