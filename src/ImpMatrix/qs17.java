package ImpMatrix;

import java.util.*;

public class qs17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = scan.nextInt();

        System.out.println("Enter number of columns:");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int zeroCount = 0;
        int nonZeroCount = 0;

        // Count zeros and non-zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        if (zeroCount > nonZeroCount) {
            System.out.println("Given matrix is a sparse matrix.");
        } else {
            System.out.println("Given matrix is not a sparse matrix.");
        }

        scan.close();
    }
}

