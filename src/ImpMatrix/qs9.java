package ImpMatrix;
import java.util.*;
public class qs9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of square matrix:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Swap primary and secondary diagonal elements
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];               // primary diagonal
            matrix[i][i] = matrix[i][n - 1 - i];  // secondary diagonal
            matrix[i][n - 1 - i] = temp;          // complete the swap
        }

        System.out.println("Matrix after interchanging diagonals:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        sc.close();
    }
}
