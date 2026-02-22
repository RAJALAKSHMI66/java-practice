package ImpStr;
import java.util.*;

public class s20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] visited = new boolean[str.length()];

        System.out.println("Frequency of all characters in the given string:");

        for (int i = 0; i < str.length(); i++) {
            if (visited[i])
                continue;

            char ch = str.charAt(i);
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("'" + ch + "' = " + count);
        }

        sc.close();
    }
}



//package ImpStr;
//import java.util.*;
//
//public class s20_array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter input string: ");
//        String str = sc.nextLine().toLowerCase();
//
//        int[] freq = new int[256]; // ASCII size
//
//        for (int i = 0; i < str.length(); i++) {
//            freq[str.charAt(i)]++;
//        }
//
//        System.out.println("Frequency of all characters in the given string:");
//        for (int i = 0; i < 256; i++) {
//            if (freq[i] > 0) {
//                System.out.println("'" + (char)i + "' = " + freq[i]);
//            }
//        }
//
//        sc.close();
//    }
//}
