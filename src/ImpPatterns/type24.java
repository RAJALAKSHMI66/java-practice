//        i=1,winlen=9,space=0,n=5
//        i=2,winlen=7,space=1,n=5
//        i=3,winlen=5,space=2,n=5
//        i=4,winlen=3,space=3,n=5
//        i=5,winlen=1,space=4,n=5

package ImpPatterns;
import java.util.Scanner;
public class type24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        // Upper half
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++) {
                if(j == 1 || j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower half
        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= i; j++) System.out.print(" ");
            for(int j = 1; j <= (n-i)*2-1; j++) {
                if(j == 1 || j == (n-i)*2-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}