public class T_2_3_10 {
    public static void main(String[] args) {
    }
}

    public static boolean isPalindrome(String text) {
        String editedText = text.replaceAll("\\W|\\s", "");
        String sb = new StringBuilder(editedText).reverse().toString();
        return editedText.equalsIgnoreCase(sb);
    }