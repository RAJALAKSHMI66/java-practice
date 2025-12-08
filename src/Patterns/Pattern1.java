package Patterns;
import java.util.*;
public class Pattern1 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int i;
        int j;
        int n=scan.nextInt();
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" $ ");
            }
            System.out.println(" ");
        }

    }
}
