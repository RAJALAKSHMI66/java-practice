package String;
import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        String reversed="";
        for(int i=n.length()-1;i>=0;i--){
            reversed+=n.substring(i,i+1);
        }
        if (reversed.equals(n)){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}