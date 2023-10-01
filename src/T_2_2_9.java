public class T_2_2_9 {
    public static void main(String[] args) {
    }

    {
        public static boolean isPowerOfTwo ( int value){
        int B = Math.abs(value);
        int C = B - 1;
        return ((B & C) == 0) && (B != 0);
    }
    }
}