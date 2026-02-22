package ImpMatrix;
import java.util.*;
public class qs4 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the rows in first array: ");
        int row_1=scan.nextInt();
        System.out.println("Enter the columns in first array: ");
        int col_1=scan.nextInt();
        System.out.println("Enter the rows in second array: ");
        int row_2=scan.nextInt();
        System.out.println("Enter the columns in second array: ");
        int col_2=scan.nextInt();
        if(col_1 != row_2){
            System.out.println("Not possible");
            scan.close();
            return;
        }
        int[][] A=new int[row_1][col_1];
        int[][] B=new int[row_2][col_2];
        int[][] C=new int[row_1][col_2];
        System.out.println("Enter the elements for the first matrix: ");
        for(int i=0;i<row_1;i++){
            for(int j=0;j<col_1;j++){
                A[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the elements for the second matrix: ");
        for(int i=0;i<row_2;i++){
            for(int j=0;j<col_2;j++){
                B[i][j]=scan.nextInt();
            }
        }
        //to display
        for(int i=0;i<row_1;i++){
            System.out.println(Arrays.toString(A[i]));
        }
        for(int i=0;i<row_2;i++){
            System.out.println(Arrays.toString(B[i]));
        }
        for(int i=0;i<row_1;i++){
            for(int j=0;j<col_2;j++){
                C[i][j]=0;
                for(int k=0;k<col_1;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Result: ");
        for(int i=0;i<row_1;i++){
            System.out.println(Arrays.toString(C[i]));
        }
        scan.close();
    }
}
