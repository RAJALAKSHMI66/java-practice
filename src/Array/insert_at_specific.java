package Array;
import java.util.*;
public class insert_at_specific {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int i;
        System.out.println("enter the length of an array" );
        int k=scan.nextInt();
        int[]s=new int[k];
        System.out.println("Enter " + k + " elements:");
        for (i=0;i<k;i++){
            list.add(scan.nextInt());
        }
        System.out.println("enter the element to insert");
        int o=scan.nextInt();
        System.out.println("enter the position to insert");
        int p=scan.nextInt();
        list.add(p-1,o);
        System.out.println("Elements of array are:"+list);
    }
}
