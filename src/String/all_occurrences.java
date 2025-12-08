package String;
import java.util.ArrayList;
import java.util.Scanner;
public class all_occurrences {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        char c=scan.next().charAt(0);
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==c){
                System.out.println("[ "+i+" ]");
            }
        }
    }
}


