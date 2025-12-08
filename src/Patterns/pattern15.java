//A
//BB
//CCC
package Patterns;
import java.util.Scanner;
public class pattern15 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        for(char m='A';m<=n;m++){
            for(char j='A';j<=m;j++){
                System.out.print(m);
            }
            System.out.println(" ");
        }

    }
}
