package ImpMatrix;
import java.util.*;

public class qs11 {
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
        boolean upper=false;
        // Sum of strictly lower triangular elements (i > j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // j < i ensures below diagonal
                if(matrix[i][j]==0){
                    upper=true;
                }
            }
        }
        if (upper=true){
            System.out.println("Upper triangle ");
        }
        else{
            System.out.println("not ");
        }
        sc.close();
    }
}
