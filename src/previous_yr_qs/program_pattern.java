package previous_yr_qs;
import java.util.Scanner;
public class program_pattern {
        public static void main(String[]args){
            Scanner scan=new Scanner(System.in);
            String n=scan.nextLine();
            for(int i=0;i<n.length();i++){
                for(int j=0;j<n.length();j++){
                    if(j==i){
                        System.out.print(n.charAt(i));
                    }
                    else if(j==n.length()-i-1){
                        System.out.print(n.charAt(j));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

