package Imp2;

import java.util.*;

public class CricketScore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter score string: ");
        String s = scan.nextLine();

        int player1 = 0;
        int player2 = 0;
        int extras = 0;

        boolean strikerP1 = true; // Player 1 starts on strike

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Dot ball
            if (ch == '.') {
                continue;
            }

            // Wide
            else if (ch == 'W') {
                extras += 1;
            }

            // No-ball
            else if (ch == 'N') {
                extras += 1;
            }

            // Runs (1–6)
            else if (ch >= '1' && ch <= '6') {
                int runs = ch - '0';

                if (strikerP1) {
                    player1 += runs;
                } else {
                    player2 += runs;
                }

                // Strike change for odd runs
                if (runs == 1 || runs == 3 || runs == 5) {
                    strikerP1 = !strikerP1;
                }
            }
        }

        System.out.println("Player 1 Runs: " + player1);
        System.out.println("Player 2 Runs: " + player2);
        System.out.println("Extras: " + extras);
    }
}
