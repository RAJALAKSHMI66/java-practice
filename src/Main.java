import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // Read entire input until EOF
        while (sc.hasNext()) {
            String value = sc.next();

            // Remove everything except digits and minus sign
            value = value.replaceAll("[^0-9-]", "");

            if (!value.isEmpty()) {
                sum += Integer.parseInt(value);
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
