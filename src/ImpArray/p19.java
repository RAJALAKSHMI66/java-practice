package ImpArray;
import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements of array
        System.out.println("Input elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort even and odd separately in-place
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Both even
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                // Both odd
                else if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                // Swap even before odd
                else if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Output in sorted order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}