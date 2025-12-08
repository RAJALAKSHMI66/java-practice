package String;
import java.util.*;

public class remove_word_1_occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String m = scan.nextLine();
        String  result=n.replaceFirst(m,"");
        System.out.println(result);
        }
    }

