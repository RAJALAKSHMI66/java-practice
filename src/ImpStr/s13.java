package ImpStr;
class s13 {
    public static void main(String[] args) {

        String str = "I love learning programming at Codeforwin";

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
