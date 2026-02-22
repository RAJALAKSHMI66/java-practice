package ImpStr;
import java.util.*;

public class s16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
