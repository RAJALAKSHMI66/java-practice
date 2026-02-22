package ImpStr;
import java.util.*;
public class s31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(word, index)) != -1) {
            count++;
            index = index + word.length();
        }

        System.out.println("Total occurrences of '" + word + "': " + count);

        sc.close();
    }
}
