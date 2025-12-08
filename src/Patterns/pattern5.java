package Patterns;

import java.util.Scanner;
public class pattern5 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0,p=65;i<n;i++,p++){
            for (int j=0;j<n;j++){
                System.out.print((char)p+" ");
            }
            System.out.println(" ");
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
        for (char ch = 'A'; ch <= n; ch++) {
            for (int j = 0; j < (n - 'A' + 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

 */