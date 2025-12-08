package High_voltage;
import java.util.*;
public class rotate_90_matrix {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter n:");
        int n=scan.nextInt();
        int[][]matrix=new int[n][n];
        System.out.println("enter"+n+"X"+n+"matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        //transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
