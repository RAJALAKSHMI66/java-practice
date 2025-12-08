package String;
import java.util.*;

public class remove_first_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        char m = scan.next().charAt(0);
        String result = n.replaceFirst(Character.toString(m), "");
        System.out.println( result);
    }
}
