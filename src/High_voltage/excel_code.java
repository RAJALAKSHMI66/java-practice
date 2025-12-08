package High_voltage;
import java.util.*;
public class excel_code {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        int result=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            int value=ch-'A'+1;
            result=result*26+value;
        }
        System.out.println(result);
    }
}
