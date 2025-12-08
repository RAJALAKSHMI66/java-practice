package String;
import java.util.Scanner;
public class replace_1occurrence_other {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String result="";
        char c=scan.next().charAt(0);
        char m=scan.next().charAt(0);
        for (int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            result = n.replaceFirst(Character.toString(c), Character.toString(m));
        }
        System.out.println(result);
    }
}
