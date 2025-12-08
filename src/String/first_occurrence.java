package String;
import java.util.Scanner;
public class first_occurrence {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        char c=scan.next().charAt(0);
        int m=n.indexOf(c);
        System.out.println(m);
    }
}
