package ImpPatterns;
import java.util.*;
public class type22 {
    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        i=1,winlen=1,space=4,n=5
//        i=2,winlen=4,space=3,n=5
//        i=3,winlen=6,space=2,n=5
//        i=4,winlen=8,space=1,n=5
//        i=5,winlen=10,space=0,n=5
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i==n||j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}