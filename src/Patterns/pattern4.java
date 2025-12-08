package Patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0, p = 3; j < n; j++,p--) {
                System.out.print(p + " ");
            }
            System.out.println(" ");

        }
    }
}
