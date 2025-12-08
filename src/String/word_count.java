package String;
import java.util.Scanner;
public class word_count {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String[]m=n.split("\\s+");
        int count=m.length;
        System.out.println(count);
    }
}
