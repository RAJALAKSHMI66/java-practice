package ImpArray;
import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Read elements of first array
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements from arr1 to arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        // Print Array1
        System.out.print("Array1: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Print Array2
        System.out.print("\nArray2: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
