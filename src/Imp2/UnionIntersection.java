package Imp2;

public class UnionIntersection {
    public static void main(String[] args) {

        int[] list1 = {1, 3, 4, 5, 6, 8, 9};
        int[] list2 = {1, 5, 8, 9, 2};

        // UNION
        System.out.print("Union: ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
        for (int i = 0; i < list2.length; i++) {
            boolean found = false;
            for (int j = 0; j < list1.length; j++) {
                if (list2[i] == list1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(list2[i] + " ");
            }
        }
        System.out.println();

        // INTERSECTION
        System.out.print("Intersection: ");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    System.out.print(list1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();

        // EXCEPT
        System.out.print("Except: ");
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 2 != 0) {
                System.out.print(list1[i] + " ");
            }
        }
        for (int i = 0; i < list2.length; i++) {
            if (list2[i] % 2 == 0) {
                System.out.print(list2[i] + " ");
            }
        }
    }
}

