package String;
import java.util.*;

public class remove_word_all_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String m = scan.nextLine();
        String  result=n.replace(m,"");
        System.out.println(result);
    }
}

