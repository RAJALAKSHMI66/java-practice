package ImpArray;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Input array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position to delete
        System.out.print("Input position to delete: ");
        int pos = sc.nextInt();

        // Check valid position
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to left
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Print updated array
            System.out.print("Array elements: ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i]);
                if (i < n - 2) {
                    System.out.print(", ");
                }
            }
        }
        sc.close();
    }
}
