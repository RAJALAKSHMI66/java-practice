package Imp2;

import java.util.*;

public class RectangleSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}
        };

        System.out.print("Row 1 & Col 1: ");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();

        System.out.print("Row 2 & Col 2: ");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();

        int sum = 0;

        System.out.println("Rectangle:");
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum: " + sum);
    }
}
