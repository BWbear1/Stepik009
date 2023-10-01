public class T_2_3_10 {
    public static void main(String[] args) {
    }
}
    public static boolean isPalindrome(String text) {
        String newString = text.replaceAll("[^A-Za-z1-9]+", "");
        String newStringLow = newString.toLowerCase();
        StringBuilder sb = new StringBuilder(newStringLow);
        sb.reverse();
        String reverseString = sb.toString();
        boolean test = newStringLow.equals(reverseString);
        return test;
    }