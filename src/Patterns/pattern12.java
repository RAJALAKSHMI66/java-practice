package Patterns;
import java.util.Scanner;
public class pattern12 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=n;i>=1;i--){
            for (int j=0;j<(n-i+1);j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
