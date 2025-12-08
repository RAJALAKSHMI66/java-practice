package Patterns;
import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            int start = n - i + 1;
            for (int j = start; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = n - 1; j >= start; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
