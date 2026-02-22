package ImpStr;
import java.util.*;
public class s38 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  any string:");
        String n=scan.nextLine();
        String result=n.trim().replaceAll("\\s+"," ");
        System.out.println("the result:"+result);
    }
}
