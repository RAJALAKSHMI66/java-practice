package ZImp;
import java.util.*;

public class ValidExpression {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    static boolean isValidExpression(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Opening bracket
            if (c == '(') {
                stack.push(c);
            }

            // Closing bracket
            else if (c == ')') {
                if (stack.isEmpty()) return false;

                // Check for operator before ')'
                if (i > 0 && isOperator(s.charAt(i - 1))) {
                    return false;
                }

                stack.pop();
            }

            // Operator checks
            else if (isOperator(c)) {
                // Operator at start or after '('
                if (i == 0 || s.charAt(i - 1) == '(') {
                    return false;
                }
            }
        }

        // Check for unbalanced brackets
        if (!stack.isEmpty()) return false;

        // Expression should not end with operator
        char last = s.charAt(s.length() - 1);
        if (isOperator(last)) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();

        if (isValidExpression(expr)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
