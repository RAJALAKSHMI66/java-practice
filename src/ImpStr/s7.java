package ImpStr;

class s7 {
    public static void main(String[] args) {

        String str = "Learn at Codeforwin.";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // space or special character
            }
        }

        System.out.println("Toggled case string: " + result.toString());
    }
}

