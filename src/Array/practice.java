/*Sample Input:
        Input array elements:Sample Input:
Input array elements: 1, 10, 20, 1, 25, 1, 10, 30, 25, 1
Sample Output:
Total number of duplicate elements = 5
        Sample Output:
        Total number of duplicate elements = 5package Array;

 */
import java.util.*;
public class practice {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int []arr ={1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
        int count =0;
        for(int i=0;i<=arr.length; i++){
            for(int j=0;j<=arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println(count);

                }
            }
        }
        }
    }