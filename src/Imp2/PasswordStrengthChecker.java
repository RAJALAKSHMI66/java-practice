package Imp2;

import java.util.*;

public class PasswordStrengthChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scan.nextLine();

        int rulesSatisfied = 0;

        // Rule 1: Minimum length
        if (password.length() >= 8) {
            rulesSatisfied++;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        if (hasLetter) rulesSatisfied++;
        if (hasDigit) rulesSatisfied++;
        if (hasSpecial) rulesSatisfied++;

        // Strength decision
        if (password.length() < 8 || rulesSatisfied == 1) {
            System.out.println("Weak");
        } else if (rulesSatisfied == 2) {
            System.out.println("Medium");
        } else if (rulesSatisfied == 3) {
            System.out.println("Good");
        } else {
            System.out.println("Strong");
        }
    }
}
