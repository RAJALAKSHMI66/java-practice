package Array;

public class count_odd_even {
    public static void main(String[]args){
        int i;
        int count_even=0;
        int count_odd=0;
        int n[]={10,5,3,6,7};
        for (i=0;i<n.length;i++) {
            if (n[i] % 2 == 0) {
                count_even += 1;
            } else {
                count_odd += 1;
            }
        }
        System.out.println(count_even);
        System.out.println(count_odd);
    }
}

/*
package Array;
import java.util.*;
public class practice {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter  number of array");
        int n=scan.nextInt();
        int i;
        int count_even=0;
        int count_odd=0;
        int[] k=new int[n];
        for(i=0;i<n;i++){
            k[i]=scan.nextInt();
        }
        for (i=0;i<k.length;i++) {
            if (k[i] % 2 == 0) {
                count_even += 1;
            } else {
                count_odd += 1;
            }
        }
        System.out.println(count_even);
        System.out.println(count_odd);
    }
}
 */