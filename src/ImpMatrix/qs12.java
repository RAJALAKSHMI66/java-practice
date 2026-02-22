package ImpMatrix;
import java.util.*;

public class qs12 {
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

        int sum = 0;

        // Sum of strictly upper triangular elements (i > j)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of lower triangular matrix = " + sum);

        sc.close();
    }
}
