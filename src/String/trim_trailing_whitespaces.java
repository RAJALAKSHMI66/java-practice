package String;
import java.util.*;
public class trim_trailing_whitespaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        if (n.startsWith("\"") && n.endsWith("\"")) {
            n = n.substring(1, n.length() - 1);
        }
        String result = n.replaceAll("\\s+$", "");
        System.out.println(result);
    }
}
