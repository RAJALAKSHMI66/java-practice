package String;
import java.util.*;
public class replace_last_occurrence {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        char c=scan.next().charAt(0);
        char m=scan.next().charAt(0);
        int index=n.lastIndexOf(c);
        String result;
        if(index==-1){
            result=n;
        }
        else{
            result = n.substring(0, index) +m+ n.substring(index + 1);
        }
        System.out.println(result);
    }
}
