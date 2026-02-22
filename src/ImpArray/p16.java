package ImpArray;

import java.util.Scanner;

//public class p16 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        // Input size of array
//        System.out.print("Input size of array: ");
//        int n = scan.nextInt();
//
//        int[] arr = new int[n];
//
//        // Input elements of array
//        System.out.println("Input elements of array:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }
//        //sort
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println("Enter search element:");
//        int m=scan.nextInt();
//        int low=0;
//        int high=arr.length-1;
//        boolean found=false;
//        while(low<=high) {
//            int mid=low+(high-low)/2;
//            if (arr[mid] == m) {
//                System.out.println("search found at:" + (mid + 1));
//                found=true;
//                break;
//            } else if (arr[mid] > m) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        if(!found){
//            System.out.println("not found");
//        }
//        scan.close();
//    }
//}


import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input size of array
        System.out.print("Input size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        // Input elements of array
        System.out.println("Input elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Input element to search
        System.out.println("Enter search element:");
        int m = scan.nextInt();

        boolean found = false;

        // Linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                System.out.println("Search found at original position: " + (i + 1));
                found = true;
                break; // stop after finding the first occurrence
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }

        scan.close();
    }
}

