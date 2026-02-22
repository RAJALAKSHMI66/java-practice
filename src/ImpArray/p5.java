package ImpArray;
import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count negative elements
        int negativeCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }

        // Print result
        System.out.println("Total number of negative elements: " + negativeCount);
    }
}
