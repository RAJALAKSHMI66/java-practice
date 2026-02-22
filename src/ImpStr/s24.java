package ImpStr;
import java.util.*;
public class s24 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(result.indexOf(c)==-1){
                result=result+c;
            }
        }
        System.out.println(result);
    }
}
