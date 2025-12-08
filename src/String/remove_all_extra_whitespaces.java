package String;
import java.util.*;
public class remove_all_extra_whitespaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String result = n.replaceAll("\\s+", " ").trim();
        System.out.println(result);
    }
}
