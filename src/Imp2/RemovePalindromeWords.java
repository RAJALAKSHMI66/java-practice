package Imp2;

import java.util.Scanner;

public class RemovePalindromeWords {

    // Function to check palindrome
    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            if (!isPalindrome(word)) {
                System.out.print(word + " ");
            }
        }
    }
}

