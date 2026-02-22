package ImpMatrix;
import java.util.*;

//public class qs19 {
//    public static void main(String[] args) {
//
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        System.out.println("Original Matrix:");
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//
//        System.out.println("\nRequired Output:");
//
//        System.out.println(Arrays.toString(new int[]{
//                matrix[0][0], matrix[0][1], matrix[0][2]
//        }));
//
//        System.out.println(Arrays.toString(new int[]{
//                matrix[1][2], matrix[2][2], matrix[2][1]
//        }));
//
//        System.out.println(Arrays.toString(new int[]{
//                matrix[2][0], matrix[1][0], matrix[1][1]
//        }));
//    }
//}

import java.util.*;

public class qs19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Input size
        System.out.println("Enter n:");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix
        System.out.println("Enter the matrix (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // Spiral traversal boundaries
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        System.out.print("Spiral order: ");

        while (top <= bottom && left <= right) {

            // left → right (top row)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // top → bottom (right column)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // right → left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom → top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        scan.close();
    }
}
