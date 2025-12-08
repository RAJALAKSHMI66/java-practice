package String;
import java.util.*;
public class count_all_word_occurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String m = scan.nextLine();
        int count = 0;
        int index = n.indexOf(m);
        while (index != -1) {
            count++;
            index = n.indexOf(m, index + 1);
        }
            System.out.println(count);
        }
    }

