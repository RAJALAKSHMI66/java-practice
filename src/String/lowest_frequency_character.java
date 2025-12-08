package String;
import java.util.*;
public class lowest_frequency_character {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        HashMap<Character,Integer>freq=new HashMap<>();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(Character.isWhitespace(ch))continue;
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        char minchar=' ';
        int minfreq= Integer.MAX_VALUE;
        for(char key:freq.keySet()){
            int value=freq.get(key);
            if(value<minfreq){
                minfreq = value;
                minchar = key;
            }
        }
        System.out.println(freq);
        System.out.println(minchar);
        System.out.println(minfreq);
    }
}
