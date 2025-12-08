package String;
import java.util.*;

public class remove_word_last_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String m = scan.nextLine();
        int index=n.lastIndexOf(m);
        String  result=n.substring(0, index) + n.substring(index+m.length());
        System.out.println(result);
    }
}

