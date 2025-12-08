package String;
import java.util.Scanner;
public class count_alphabet_digit {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        int alphabet=0,digit=0,special_character=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(Character.isLetter(ch)){
                alphabet++;
            }
            else if(Character.isDigit(ch)){
                digit++;
            }
            else{
                special_character++;
            }
        }
        System.out.println(alphabet);
        System.out.println(digit);
        System.out.println(special_character);
    }
}
