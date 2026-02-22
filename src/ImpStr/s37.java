package ImpStr;
import java.util.*;
public class s37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string (including spaces)
        System.out.println("Input string:");
        String str = sc.nextLine();

        // Remove leading and trailing spaces using trim()
        String result = str.trim();

        // Print result
        System.out.println("String after removing leading and trailing white spaces:");
        System.out.println("\"" + result + "\"");
    }
}