package ImpStr;
import java.util.*;

public class s36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string
        System.out.println("Input string:");
        String str = sc.nextLine();

        // Remove trailing spaces using regex
        String result = str.replaceAll("\\s+$", "");

        // Print result
        System.out.println("String after removing trailing white spaces:");
        System.out.println("\"" + result + "\"");
    }
}
