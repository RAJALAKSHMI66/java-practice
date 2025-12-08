package Patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0,p=65;j<n;j++,p++){
                System.out.print((char)p+" ");
            }
            System.out.println(" ")  ;
            }
        }
}


/*
package Patterns;

import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        n = Character.toUpperCase(n);
        for(int i=0;i<(n-'A'+1);i++){
            for (char ch = 'A'; ch <= n; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

 */