package ImpStr;
import java.util.*;

public class s33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter word to remove: ");
        String word = sc.nextLine();

        int index = str.lastIndexOf(word);

        if (index != -1) {
            String result = str.substring(0, index) + str.substring(index + word.length());
            System.out.println("String after removing last occurrence of '" + word + "':");
            System.out.println(result);
        } else {
            System.out.println("Word not found.");
        }

        sc.close();
    }
}
