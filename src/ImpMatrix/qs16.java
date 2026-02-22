package ImpMatrix;
import java.util.*;

public class qs16 {
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

        boolean isIdentity = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) {  //00 11 22 ==1
                    isIdentity = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) { //01 10 21 20 ==0
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) {
                break;
            }
        }

        if (isIdentity) {
            System.out.println("Given matrix is an identity matrix.");
        } else {
            System.out.println("Given matrix is not an identity matrix.");
        }

        sc.close();
    }
}
