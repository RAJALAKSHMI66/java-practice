package ImpStr;
import java.util.*;

public class s30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String str = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int index = 0;
        while((index=str.indexOf(word,index))!=-1){
            System.out.println(word+" found at"+index);
            index=index+word.length();
        }
        }
    }