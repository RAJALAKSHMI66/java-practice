package String;
import java.util.Scanner;
public class reverse_string {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String reversed="";
        for(int i=n.length()-1;i>=0;i--){
            reversed+=n.substring(i,i+1);
        }
        System.out.println(reversed);
    }
}

/*package String;
public class reverse_string {
    public static void main(String[] args) {
        // Input string
        String text = "I love Codeforwin";

        // Using StringBuilder to reverse
        String reversed = new StringBuilder(text).reverse().toString();

        // Output result
        System.out.println("Reversed string: " + reversed);
    }
}*/
