package ImpArray;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array1: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.print("Input size of array2: ");
        int m= sc.nextInt();

        int[] arr2 = new int[m];

        // Input elements of array
        System.out.println("Input elements of array1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Input elements of array2:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int count=arr1.length+  arr2.length;
        int[]result=new int [count];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            result[k++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            result[k++]=arr2[i];
        }
        System.out.println("merged array");
        for(int i=0;i<count;i++){
            System.out.print(result[i]+" ");
        }
    }

    }

