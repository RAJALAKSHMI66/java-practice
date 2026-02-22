package ImpArray;

import java.util.Scanner;

public class p11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input array size
//        System.out.print("Input size of array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        // Input array elements
//        System.out.println("Input array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Remove duplicates
//        int newSize = n; // keep track of unique elements size
//
//        for (int i = 0; i < newSize; i++) {
//            for (int j = i + 1; j < newSize; j++) {
//                if (arr[i] == arr[j]) {
//                    // Shift all elements to the left
//                    for (int k = j; k < newSize - 1; k++) {
//                        arr[k] = arr[k + 1];
//                    }
//                    newSize--; // reduce array size
//                    j--; // check this index again as it has new value after shifting
//                }
//            }
//        }
//
//        // Print array after removing duplicates
//        System.out.println("After removing all duplicate elements:");
//        System.out.print("Elements of array are: ");
//        for (int i = 0; i < newSize; i++) {
//            System.out.print(arr[i]);
//            if (i < newSize - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("\ncount of duplicate :"+ (n-newSize));
//
//        sc.close();
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int duplicateCount = 0;

    // Count duplicate elements
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                duplicateCount++;
                break;  // Avoid counting same element multiple times
            }
        }
    }

    System.out.println("Total number of duplicate elements = " + duplicateCount);

    sc.close();
}
}
