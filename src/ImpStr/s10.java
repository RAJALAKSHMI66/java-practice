package ImpStr;
class s10 {
    public static void main(String[] args) {

        String str = "I love Codeforwin.";

        String[] words = str.trim().split("\\s+");
        System.out.println("Total number of words: " + words.length);
    }
}
