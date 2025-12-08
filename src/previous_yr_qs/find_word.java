package previous_yr_qs;

public class find_word {
        public static void main(String[] args) {
            String text = "WELCOMETOZOHOCORPORATION";
            String word = "TOO";
            int n = 5, m = 5;
            char[][] arr = new char[n][m];
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = (k < text.length()) ? text.charAt(k++) : 'X';
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= m - word.length(); j++) {
                    int l = 0;
                    while (l < word.length() && arr[i][j + l] == word.charAt(l)) l++;
                    if (l == word.length()) {
                        System.out.println("Start index: <" + (i + 1) + "," + (j + 1) + ">");
                        System.out.println("End index: <" + (i + 1) + "," + (j + word.length()) + ">");
                        return;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                for (int i = 0; i <= n - word.length(); i++) {
                    int l = 0;
                    while (l < word.length() && arr[i + l][j] == word.charAt(l)) l++;
                    if (l == word.length()) {
                        System.out.println("Start index: <" + (i + 1) + "," + (j + 1) + ">");
                        System.out.println("End index: <" + (i + word.length()) + "," + (j + 1) + ">");
                        return;
                    }
                }
            }
            System.out.println("Word not found!");
        }
    }


