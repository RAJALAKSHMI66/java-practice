package String;
import java.util.*;
public class frequency_each_character {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        HashMap<Character,Integer>freq=new HashMap<>();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(Character.isWhitespace(ch))continue;
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);
    }
}



/*package String;
import java.util.HashMap;
import java.util.Scanner;

public class highest_frequency_character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scan.nextLine();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') continue;
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char key : freq.keySet()) {
            System.out.println( key + " -> " + freq.get(key));
        }
    }
}*/
