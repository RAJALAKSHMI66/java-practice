package Imp2;
import java.util.*;
public class Pangram_Checking {
    public static void main(String[]args){
        boolean[] freq = new boolean[26];
        System.out.println("enter the string:");
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (n >= 'a' && n <= 'z') {
                freq[n - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < freq.length; i++) {
            if (!freq[i]) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram);
    }
}