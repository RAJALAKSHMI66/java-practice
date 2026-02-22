package ImpStr;
import java.util.*;

public class s34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string
        System.out.println("Input string:");
        String str = sc.nextLine();

        // Read the word to remove
        System.out.println("Input word to remove:");
        String word = sc.nextLine();

        // Remove all occurrences of the word with optional leading/trailing spaces
        // "\\b" ensures whole word match
        String result = str.replaceAll("\\b" + word + "\\b", "").replaceAll("\\s+", " ");

        // Print result
        System.out.println("String after removing '" + word + "':");
        System.out.println(result.trim());
    }
}
