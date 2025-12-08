package String;
import java.util.Scanner;
public class count_all_occurrences {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        int count=0;
        char c=scan.next().charAt(0);
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if (ch==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
