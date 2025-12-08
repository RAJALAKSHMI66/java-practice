package two_dimensional_array;
import java.util.*;
public class add_two_array {
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
        int[] rowadd=new int[row];
        for (int i = 0; i < row; i++) {
            int rowsum = 0;
            for (int j = 0; j < column; j++) {
                rowsum += arr[i][j];
            }
            rowadd[i]=rowsum;
        }
        int[] coladd=new int[column];
        for (int j = 0; j < column; j++) {
            int colsum = 0;
            for (int i = 0; i < row; i++) {
                colsum += arr[i][j];
            }
            coladd[j]=colsum;
        }
        System.out.println("Rows sum:"+Arrays.toString(rowadd));
        System.out.println("column sum:"+Arrays.toString(coladd));
    }
}