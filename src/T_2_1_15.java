public class T_2_1_15 {
        public static void main(String[] args) {
        }
        public static int flipBit(int value, int bitIndex) {
                int base = 2;
                int result = 1;
                for (int i = 1; i < bitIndex; i++) {
                        result *= base;

                }
                int itog;
                return itog = value ^ result;
        }
        }
