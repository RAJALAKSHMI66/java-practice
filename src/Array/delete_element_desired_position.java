package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class delete_element_desired_position {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int i;
        System.out.println("enter the length of an array" );
        int k=scan.nextInt();
        System.out.println("Enter " + k + " elements:");
        for (i=0;i<k;i++){
            list.add(scan.nextInt());

        }
        System.out.println("enter the position to remove");
        int p=scan.nextInt();
        list.remove(p-1);
        System.out.println("Elements of array are:"+list);
    }

}
