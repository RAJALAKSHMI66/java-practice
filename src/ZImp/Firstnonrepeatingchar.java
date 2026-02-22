package ZImp;

import java.util.*;

public class Firstnonrepeatingchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Frequency array for ASCII characters
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find first non-repeating character
        char result = 0;
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                result = s.charAt(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }
}

