package ImpArray;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements of array
        System.out.println("Input elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("in reverse order");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
