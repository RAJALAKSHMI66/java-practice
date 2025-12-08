package String;
import java.util.Scanner;
public class reverse_words {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String reversed="";
        String[]m=n.split("\\s+");
        for(int i=m.length-1;i>=0;i--){
            reversed+=m[i]+" ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);
    }
}
