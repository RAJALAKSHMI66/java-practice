package Imp2;

public class OddEven {
    public static void main(String[] args) {

        int[] arr = {5, 8, 11, 6, 2, 17};
        int n = arr.length;

        // Bubble sort with custom conditions
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                int a = arr[j];
                int b = arr[j + 1];

                boolean swap = false;

                // even before odd → swap
                if (a % 2 == 0 && b % 2 != 0) {
                    swap = true;
                }
                // both odd → ascending
                else if (a % 2 != 0 && b % 2 != 0 && a > b) {
                    swap = true;
                }
                // both even → descending
                else if (a % 2 == 0 && b % 2 == 0 && a < b) {
                    swap = true;
                }

                if (swap) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print result
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

