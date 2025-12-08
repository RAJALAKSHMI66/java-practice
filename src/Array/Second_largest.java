package Array;
import java.util.*;
public class Second_largest {
   public static void main(String[]args){
       int[]n={10,5,8,6};
       Arrays.sort(n);
       System.out.println(n[n.length-2]);
   }
}

/*
package Array;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int i;
        int n=scan.nextInt();
        int []m=new int[n];
        System.out.println("enter "+n+" numbers");
        for (i=0;i<n;i++){
            m[i]=scan.nextInt();
        }
        Arrays.sort(m);
        System.out.println(m[m.length-2]);
        }
    }
 */