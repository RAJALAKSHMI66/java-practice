package String;
import java.util.Scanner;
public class concat {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string 1:");
        String n=scan.nextLine();
        System.out.println("enter string 2:");
        String m=scan.nextLine();
        String o=n.concat(m);
        String b = n+m;

        System.out.println("combined string: "+b);
        System.out.println("combined string: "+o);
    }
}
