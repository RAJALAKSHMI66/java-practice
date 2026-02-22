package Imp2;

import java.util.*;

public class ThreeFourTerms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        for (int i = 1; i <= terms; i++) {
            int n = i;
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
}

