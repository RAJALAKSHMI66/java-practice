package previous_yr_qs;
import java.util.*;
public class find_weight {
    public static void main(String[] args) {
        int[] arr = {10, 36, 54, 89, 12};
        List<int[]> list = new ArrayList<>();
        for (int num : arr) {
            int weight = 0;
            int root = (int) Math.sqrt(num);
            if (root * root == num) {
                weight += 5;
            }
            if (num % 4 == 0 && num % 6 == 0) {
                weight += 4;
            }
            if (num % 2 == 0) {
                weight += 3;
            }
            list.add(new int[]{num, weight});
        }
        Collections.sort(list, (a, b) -> a[1] - b[1]);
        for (int[] pair : list) {
            System.out.print("<" + pair[0] + "," + pair[1] + "> ");
        }
    }

}