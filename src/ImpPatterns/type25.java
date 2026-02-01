package ImpPatterns;

import java.util.Scanner;

public class type25 {
    public static void main(String[] args) {
        //Square hallow pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        /*
        i = 1, space = 0, n = 5, clen = 5
        i = 2, space = 1, n = 5, clen = 4
        i = 3, space = 2, n = 5, clen = 3
        i = 4, space = 3, n = 5, clen = 2
        i = 5, space = 4, n = 5, clen = 1
         */
        //upper part of the pattern
        for(int i=1;i<=n;i++){
            //Print leading spaces
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            //Print stars and spaces in side the hallow upper triangle
            for(int j=1;j<=n-i+1;j++){
                if(j==1 || i==1 || j == n-i+1){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  "); //double space
                }
            }
            System.out.println();
        }
        /*
        i = 1, space = 3, n = 5 , clen = 2
        i = 2, space = 2, n = 5 , clen = 3
        i = 3, space = 1, n = 5 , clen = 4
        i = 4, space = 0, n = 5 , clen = 5
         */
        //Lower part of the pattern
        for(int i=1;i<n;i++){
            //Print leading spaces
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            //Print the stars and the spaces in the hallow triangle
            for(int j=1;j<=i+1;j++){
                if(j==1 || i == n-1 || j==i+1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
