package Array;
import java.util.Scanner;
public class sum_of_elements {
    public static void main(String[]args){
        int i;
        int sum=0;
        int[] n={10,20,20};
        for (i=0;i<n.length;i++){
            sum+=n[i];
        }
        System.out.println(sum);
    }
}
/*package Array;
import java.util.Scanner;
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
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += m[i];
        }
        System.out.println("Sum of elements = " + sum);
        scan.close();
    }
}
*/

