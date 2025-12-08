package High_voltage;
import java.util.*;

public class clock_wise_array_rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input size
        System.out.println("Enter n:");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];

        // Input array
        System.out.println("Enter the matrix (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // Spiral traversal
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        List<Integer> spiral = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // left → right
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }

        // Output spiral order
        System.out.println(spiral);
    }
}
