package ImpMatrix;
import java.util.*;
public class qs5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int column = scan.nextInt();
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
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
        boolean same=true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (A[i][j] != B[i][j]) {
                    same = false;
                    break;
                }
            }
            if (!same) {
                break;
            }
        }

        if (same) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        scan.close();
    }
}
