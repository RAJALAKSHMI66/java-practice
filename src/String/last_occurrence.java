package String;
import java.util.Scanner;
public class last_occurrence {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        char  c=scan.next().charAt(0);
        int m=n.lastIndexOf(c);
        System.out.println(m);
    }
}
