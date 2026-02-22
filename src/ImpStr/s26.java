package ImpStr;
import java.util.*;

public class s26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter character to replace with: ");
        char newChar = sc.next().charAt(0);

        int index = str.lastIndexOf(oldChar);

        if (index != -1) {
            String result = str.substring(0, index) + newChar + str.substring(index + 1);

            System.out.println("String after replacing last '" + oldChar + "' with '" + newChar + "' :");
            System.out.println(result);
        } else {
            System.out.println("Character not found.");
        }

        sc.close();
    }
}
