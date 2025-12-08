package Array;
import java.util.*;
public class unique_values {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};

            // Step 1: Sort the array
            Arrays.sort(arr); // [1,1,2,2,3,5,5,10,12,20]

            System.out.print("All unique elements in the array are: ");

            // Step 2: Use for loop to check uniqueness
            for (int i = 0; i < arr.length; i++) {
                boolean bhanu = true;

                // compare arr[i] with every other element
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        bhanu = false;
                        break;
                    }
                }

                if (bhanu) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

