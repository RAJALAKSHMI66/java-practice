package High_voltage;
import java.util.*;
public class remove_repeated_character_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (Character.isWhitespace(ch)) {
                result.append(ch);
            }
            else if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        System.out.println(result.toString());
    }
}
