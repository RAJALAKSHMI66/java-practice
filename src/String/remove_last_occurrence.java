package String;
import java.util.*;

public class remove_last_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        char m = scan.next().charAt(0);
        int index=n.lastIndexOf(m);
        String result ;
        if (index == -1) {
            result = n; // character not found, keep original
        } else {
            result = n.substring(0, index) + n.substring(index + 1);
        }
        System.out.println(result);
    }
}
