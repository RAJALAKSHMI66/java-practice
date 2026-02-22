package ImpStr;

class s14 {
    public static void main(String[] args) {

        String str = "I love Codeforwin.";
        char ch = 'o';

        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("'" + ch + "' is found at index " + index);
        } else {
            System.out.println("Character not found");
        }
    }
}

