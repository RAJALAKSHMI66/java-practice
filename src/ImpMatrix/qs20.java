package ImpMatrix;
import java.util.*;

public class qs20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = scan.nextInt();

        System.out.println("Enter the number of columns:");
        int column = scan.nextInt();

        int[][] A = new int[row][column];
        int[][] R = new int[column][row]; // rotated matrix

        // Input matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A[i][j] = scan.nextInt();
            }
        }

        // Rotation logic
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                R[j][row - 1 - i] = A[i][j];     //A[0][0]=R[0][3-1-0]=[0][2]
            }
        }

        // Display original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(A[i]));
        }

        // Display rotated matrix
        System.out.println("Matrix after 90 degree clockwise rotation:");
        for (int i = 0; i < column; i++) {
            System.out.println(Arrays.toString(R[i]));
        }

        scan.close();
    }
}
