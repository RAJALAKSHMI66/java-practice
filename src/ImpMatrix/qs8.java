package ImpMatrix;
import java.util.*;
public class qs8 {
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
        int rowsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowsum+=matrix[i][j];
            }
            System.out.println("Sum of row:"+(i+1)+"="+rowsum);
        }
        int colsum=0;
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                colsum+=matrix[i][j];
            }
            System.out.println("Sum of col:"+(j+1)+"="+colsum);
        }
    }
}