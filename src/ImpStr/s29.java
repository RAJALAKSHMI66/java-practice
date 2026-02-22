package ImpStr;
import java.util.*;
public class s29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        int index=str.lastIndexOf(word);
        System.out.println(index);
    }
}