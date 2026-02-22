package ImpMatrix;
import java.util.*;
//public class qs18 {
//    public static void main(String[]arge){
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enetr the no of row");
//        int n=scan.nextInt();
//        System.out.println("Enetr the no of row");
//        int m=scan.nextInt();
//        int [][]arr=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.println("enter the value of :"+"["+i+"]["+j+"]");
//                arr[i][j]=scan.nextInt();
//            }
//        }
//        System.out.println("Given matrix:");
//        for(int i=0;i<n;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
//        if(arr[0][1]==arr[1][0]&&arr[0][2]==arr[2][0]){
//            if(arr[1][2]==arr[2][1]&&arr[1][0]==arr[0][1]){
//                System.out.println("Matrix is symmetric");
//            }
//        }
//        else{
//            System.out.println("Matrix is not symmetric");
//        }
//    }
//}


public class qs18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        boolean isSymmetric = true;

        // Check symmetry
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Given matrix is symmetric matrix.");
        } else {
            System.out.println("Given matrix is not a symmetric matrix.");
        }

        scan.close();
    }
}

