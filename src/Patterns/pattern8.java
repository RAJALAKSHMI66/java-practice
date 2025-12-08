package Patterns;
import java.util.Scanner;
public class pattern8 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(int i=0;i<(n-'A'+1);i++){
            for(char ch=n;ch>='A';ch--){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
