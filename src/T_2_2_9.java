public class T_2_2_9 {
    public static void main(String[] args) {
    }
}


    public static boolean isPowerOfTwo(int value) {
        int b = Math.abs(value);
        int c = b - 1;
        return ((b & c) == 0) && (c != 0);
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }



