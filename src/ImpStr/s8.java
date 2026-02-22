package ImpStr;

class s8 {
    public static void main(String[] args) {

        String str = "I love  1 Codeforwin.";

        int alphabets = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Alphabets = " + alphabets);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + special);
    }
}
