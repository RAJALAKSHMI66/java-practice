package ImpMatrix;

import java.util.Scanner;

public class qs15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Matrix is not square, so cannot be identity matrix.");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int det=(matrix[0][0]*matrix[1][1])-(matrix[1][0]*matrix[0][1]);
        System.out.println("Determinant="+det);
    }
}
