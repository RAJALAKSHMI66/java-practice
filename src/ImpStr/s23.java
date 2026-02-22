package ImpStr;

import java.util.Scanner;

public class s23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter char to remove: ");
        char c = sc.next().charAt(0);
        String result=str.replaceAll(Character.toString(c),"");
        System.out.println(result);
    }
}
