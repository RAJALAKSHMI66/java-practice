package Imp2;

import java.util.*;

public class ThreeFourNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = "";

        while (n > 0) {
            if (n % 2 == 1) {
                result = "3" + result;
            } else {
                result = "4" + result;
            }
            n = (n - 1) / 2;
        }

        System.out.println(result);
    }
}
