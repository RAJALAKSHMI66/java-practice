package Patterns;
import java.util.Scanner;
public class pattern39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        n = Character.toUpperCase(n);
        int rows = n - 'A' + 1;
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            char start = (char)('A' + rows - 1 + (i - 1));
            char end = (char)('A' + rows - i);
            for (char ch = start; ch >= end; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
