package ImpStr;

import java.util.Scanner;

public class s21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter char to remove: ");
        char c = sc.next().charAt(0);
        int index=str.lastIndexOf(c);
        String result=(str.substring(0, index) + str.substring(index + 1));
        System.out.println(result);
    }
}
