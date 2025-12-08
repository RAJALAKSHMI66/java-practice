package Array;

public class to_print_negative_elements {
    public static void main(String[]args) {
        int i;
        int[] n ={1, -5, -4, -9, 5};
        for (i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                System.out.println(n[i]);
            }

        }
    }
}
/*package Array;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int n = scan.nextInt();
        int[] m = new int[n];
        int i;
        System.out.println("Enter " + n + " numbers:");
        for (i = 0; i < n; i++) {
            m[i] = scan.nextInt();
        }
        System.out.println("Negative numbers are:");
        for (i = 0; i < n; i++) {
            if (m[i] < 0) {
                System.out.println(m[i]);
            }
        }
        scan.close();
    }
}
*/

