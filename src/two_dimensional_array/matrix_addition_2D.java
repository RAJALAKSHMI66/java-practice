package two_dimensional_array;
import java.util.*;
public class matrix_addition_2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int column = scan.nextInt();
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] C = new int[row][column];
        System.out.println("Enter the elements for the first matrix (A):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements for the second matrix (B):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                B[i][j] = scan.nextInt();
            }
        }

        // Matrix addition
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        // Display matrices
        System.out.println("Matrix A:");
        for (int i=0;i<row;i++) {
            System.out.println(Arrays.toString(A[i]));
        }
        System.out.println("Matrix B:");
        for (int i=0;i<row;i++) {
            System.out.println(Arrays.toString(B[i]));
        }
        System.out.println("Result (A + B):");
        for (int i=0;i<row;i++) {
            System.out.println(Arrays.toString(C[i]));
        }
        scan.close();
    }
}
