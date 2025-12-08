//C
//BB
//AAA
package Patterns;
import java.util.Scanner;
public class pattern17 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(char i=n;i>='A';i--){
            for(char j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
