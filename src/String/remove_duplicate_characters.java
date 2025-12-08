package String;
import java.util.*;
public class remove_duplicate_characters {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        HashSet<Character>seen=new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(!seen.contains(ch)){
                result.append(ch);
                seen.add(ch);
            }
        }
        System.out.println(result);
    }
}
