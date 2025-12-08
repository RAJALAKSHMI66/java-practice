package String;
import java.util.Scanner;
public class compare_string {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string 1:");
        String n=scan.nextLine();
        System.out.println("enter string 2:");
        String m=scan.nextLine();
        if (n.equals(m)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
