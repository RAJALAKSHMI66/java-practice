package ImpPatterns;
import java.util.*;

public class type21 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
