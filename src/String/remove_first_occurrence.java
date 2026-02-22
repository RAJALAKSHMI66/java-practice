package String;
import java.util.*;
import java.util.regex.Pattern;

public class remove_first_occurrence{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input string
        String n = scan.nextLine();

        // Read character to remove
        char m = scan.next().charAt(0);

        // Remove first occurrence of the character safely
        String result = n.replaceFirst(
                Pattern.quote(Character.toString(m)),
                ""
        );

        // Print result
        System.out.println(result);
    }
}
