package String;
import java.util.*;

public class word_1_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String m = scan.nextLine();
        int index = n.indexOf(m);
        if (index == -1) {
            System.out.println("Word not found.");
        } else {
            System.out.println(index);
        }
    }
}
