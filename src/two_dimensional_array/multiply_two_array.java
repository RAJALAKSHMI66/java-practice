package two_dimensional_array;
import java.util.*;
public class multiply_two_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rows:");
        int row = scan.nextInt();
        System.out.println("Enter thr length of columns:");
        int column = scan.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Enter the number of elemnets: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The two dimensional array is :");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int[] rowmultiply=new int[row];
        for (int i = 0; i < row; i++) {
            int rowmul = 1;
            for (int j = 0; j < column; j++) {
                rowmul *= arr[i][j];
            }
            rowmultiply[i]=rowmul;
        }
        int[] colmultiply=new int[column];
        for (int j = 0; j < column; j++) {
            int colmul = 1;
            for (int i = 0; i < row; i++) {
                colmul *= arr[i][j];
            }
            colmultiply[j]=colmul;
        }
        System.out.println("Rows mul:"+Arrays.toString(rowmultiply));
        System.out.println("column mul:"+Arrays.toString(colmultiply));
    }
}