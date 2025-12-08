package two_dimensional_array;
import java.util.*;
public class add_all_elements {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=scan.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns=scan.nextInt();
        int[][]arr=new int[rows][columns];
        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Elements ["+i+"] ["+j+"]:");
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("The two dimensional array is :");
        int sum=0;
        for (int i=0;i<rows;i++){
            System.out.println(Arrays.toString(arr[i]));
            for(int j=0;j<columns;j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
