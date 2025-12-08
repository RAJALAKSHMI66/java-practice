package String;
import java.util.Scanner;
public class lower_upper {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String m=n.toUpperCase();//toLowerCase
        System.out.println("Original String"+n);
        System.out.println(" String"+m);
    }
}
