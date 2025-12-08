package High_voltage;
import java.util.*;
public class String_compression {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String compressed="";
        int count=1;
        for(int i=1;i<=n.length();i++){
            if(i<n.length() && n.charAt(i)==n.charAt(i-1)){
                count++;
            }
            else{
                compressed += n.charAt(i-1)+String.valueOf(count);
                count=1;
            }
        }
            System.out.println(compressed);

    }
}
