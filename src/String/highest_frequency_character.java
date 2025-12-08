package String;
import java.util.*;
public class highest_frequency_character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (Character.isWhitespace(ch)) continue;
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        char maxChar = ' ';
        int maxFreq = 0;
        for (char key : freq.keySet()) {
            int value = freq.get(key);
            if (value > maxFreq) {
                maxFreq = value;
                maxChar = key;
            }
        }
        System.out.println(freq);
        System.out.println(maxChar);
        System.out.println(maxFreq);
    }
}


