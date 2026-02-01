package three_dimensional_array;
import java.util.*;

public class to_create {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int col = scan.nextInt();

        System.out.print("Enter depth: ");
        int depth = scan.nextInt();

        // Creating 3D array
        int[][][] arr = new int[row][col][depth];

        // Taking input
        System.out.println("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < depth; k++) {
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        // Printing the 3D array
        System.out.println("3D Array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scan.close();
    }
}
