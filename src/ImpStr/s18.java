package ImpStr;
import java.util.*;

public class s18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256]; // ASCII characters

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxFreq = Integer.MIN_VALUE;
        char maxChar = ' ';

        // Find highest frequency character
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Highest frequent character: '" + maxChar + "' = " + maxFreq);

        sc.close();
    }
}
