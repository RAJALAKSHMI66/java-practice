package Imp2;

import java.util.*;

public class PetrolBunks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int petrol = 2;   // initial petrol

        int[] distance = {1, 5, 3};
        int[] capacity = {6, 4, 2};

        int n = distance.length;

        for (int i = 0; i < n; i++) {

            // check if enough petrol to reach bunk
            if (petrol < distance[i]) {
                System.out.println("He cannot travel");
                return;
            }

            // travel to bunk
            petrol = petrol - distance[i];

            // fill petrol at bunk
            petrol = petrol + capacity[i];
        }

        System.out.println("Remaining petrol in car is " + petrol + " liters");
    }
}

