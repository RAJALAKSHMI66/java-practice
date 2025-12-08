package High_voltage;

import java.util.*;

public class shift_zero_elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int m = scan.nextInt();
        int[] k = new int[m];
        System.out.println("Enter " + m + " numbers:");
        for (int i = 0; i < m; i++) {
            k[i] = scan.nextInt();
        }
        // Two-pointer approach
        int index = 0; // position for non-zero numbers
        for (int i = 0; i < k.length; i++) {
            if (k[i] != 0) {
                k[index] = k[i];
                index++;
            }
        }
        while (index < k.length) {
            k[index] = 0;
            index++;
        }
        System.out.println("Result: " + Arrays.toString(k));
    }
}