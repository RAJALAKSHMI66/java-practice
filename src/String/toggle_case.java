package String;
import java.util.*;

public class toggle_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        StringBuilder m = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (Character.isUpperCase(ch)) {
                m.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                m.append(Character.toUpperCase(ch));
            } else {
                m.append(ch);
            }
        }

        System.out.println("Original String: " + n);
        System.out.println("Toggled Case String: " + m.toString());
        scan.close();
    }
}
