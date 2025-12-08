package String;
import java.util.*;

public class replace_all_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        char m = scan.next().charAt(0);
        char r=scan.next().charAt(0);
        String result = n.replace(Character.toString(m), Character.toString(r));
        System.out.println(result);
    }
}
