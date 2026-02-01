package ImpPatterns;

import java.util.Scanner;

public class type26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        /*
        i=1, spaces = 0, n = 5, winLen = 5
        i=2, spaces = 1, n = 5 ,winLen = 4
        i=3, spaces = 2, n = 5 ,winLen = 3
        i=4, spaces = 3, n = 5 ,winLen = 2
        i=5, spaces = 4, n = 5 ,winLen = 1
        */
        //Upper pattern
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //Print leading spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //Print star and hallow spaces
            for(int j=1;j<=n-i+1;j++){
                if(j==1 || j==n-i+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        /*
        i=1, spaces = 3, n = 5, winLen = 2
        i=2, spaces = 2, n = 5 ,winLen = 3
        i=3, spaces = 1, n = 5 ,winLen = 4
        i=4, spaces = 0, n = 5 ,winLen = 5

        */
        //Lower pattern
        //Outer loop for rows
        for(int i=1;i<n;i++){
            //Print spaces
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            //Print stars and hallow spaces
            for(int j=1;j<=i+1;j++){
                if(j==1 || j==i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
