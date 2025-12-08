package String;
import java.util.*;
public class word_all_occurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String m = scan.nextLine();
        int index = n.indexOf(m);
        boolean found = false;
        while (index != -1) {
            System.out.println(index);
            found = true;
            index = n.indexOf(m, index + 1);
            if (!found) {
                System.out.println(" not found in the string.");
            }
        }
    }
}