package Imp2;

public class Additionmanipulation {

    // Negate a number using only +
    static int negate(int x) {
        int neg = 0;
        int d = x > 0 ? -1 : 1;
        while (x != 0) {
            neg += d;
            x += d;
        }
        return neg;
    }

    // Subtraction using +
    static int subtract(int a, int b) {
        return a + negate(b);
    }

    // Multiplication using +
    static int multiply(int a, int b) {
        int result = 0;
        boolean negative = false;

        if (a < 0) {
            a = negate(a);
            negative = !negative;
        }
        if (b < 0) {
            b = negate(b);
            negative = !negative;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return negative ? negate(result) : result;
    }

    // Division using +
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        boolean negative = false;

        if (a < 0) {
            a = negate(a);
            negative = !negative;
        }
        if (b < 0) {
            b = negate(b);
            negative = !negative;
        }

        int quotient = 0;
        int sum = 0;

        while (sum + b <= a) {
            sum += b;
            quotient++;
        }

        return negative ? negate(quotient) : quotient;
    }

    public static void main(String[] args) {

        int a = 6, b = 4;
        System.out.println("Input: 6 and 4");
        System.out.println("addition " + (a + b));
        System.out.println("subtraction " + subtract(a, b));
        System.out.println("multiplication " + multiply(a, b));
        System.out.println("division " + divide(a, b));

        System.out.println();

        a = -8;
        b = -4;
        System.out.println("Input: -8 and -4");
        System.out.println("addition " + (a + b));
        System.out.println("subtraction " + subtract(a, b));
        System.out.println("multiplication " + multiply(a, b));
        System.out.println("division " + divide(a, b));
    }
}

