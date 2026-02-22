package ImpStr;
import java.util.*;
public class s27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String word = sc.nextLine();

        System.out.print("Enter word to replace with: ");
        String wordreplace = sc.nextLine();

        System.out.println(str.replaceAll(word,wordreplace));
    }
}
