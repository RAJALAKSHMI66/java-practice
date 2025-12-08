//C
//CB
//CBA
package Patterns;
import java.util.Scanner;
public class pattern18 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(char i=n;i>='A';i--){
            for(char j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
