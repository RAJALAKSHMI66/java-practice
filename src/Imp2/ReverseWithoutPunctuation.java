package Imp2;

public class ReverseWithoutPunctuation {
    public static void main(String[] args) {

        String s = "house no: 123@cbe";
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // if left is not letter or digit
            if (!isAlphaNumeric(arr[left])) {
                left++;
            }
            // if right is not letter or digit
            else if (!isAlphaNumeric(arr[right])) {
                right--;
            }
            // both are valid → swap
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }

    // helper method
    static boolean isAlphaNumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9');
    }
}

