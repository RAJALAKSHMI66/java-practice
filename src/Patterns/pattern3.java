package Patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0, p = 3; i < n; i++, p--) {
            for (int j = 0; j < n; j++) {
                System.out.print(p + " ");
            }
            System.out.println(" ");

        }
    }
}
