package Patterns;
import java.util.Scanner;
public class pattern35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        n = Character.toUpperCase(n);
        int rows = n - 'A' + 1;
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A' + (2 * i - 2); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
