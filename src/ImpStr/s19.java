package ImpStr;
import java.util.*;

public class s19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256]; // ASCII characters

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int minFreq = Integer.MAX_VALUE;
        char minChar = ' ';

        // Find least frequent character
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                minChar = (char) i;
            }
        }

        System.out.println("Least frequent character: '" + minChar + "' = " + minFreq);

        sc.close();
    }
}
