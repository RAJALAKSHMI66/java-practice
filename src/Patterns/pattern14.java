//A
//AB
//ABC
package Patterns;
import java.util.Scanner;
public class pattern14 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(char i='A';i<=n; i++){
            for (char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
