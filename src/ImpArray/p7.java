package ImpArray;
import java.util.*;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read element to insert
        int element = sc.nextInt();

        // Read position (1-based index)
        int position = sc.nextInt();

        // Create new array with size n+1
        int[] newArr = new int[n + 1];

        // Insert element at given position
        for (int i = 0; i < n + 1; i++) {
            if (i < position - 1) {
                newArr[i] = arr[i];
            } else if (i == position - 1) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        // Print result
        System.out.print("Elements of array are: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i < newArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
