import java.util.Arrays;

public class T_2_4_9 {
    public static void main(String[] args) {
        int[] a1 = new int[]{6};
        int[] a2 = new int[]{1, 3, 5};
        int[] result = new int[a1.length + a2.length];

        for (int i = 0, A = 0, B = 0; i < result.length; i++) {
            if (B==a2.length) {
                result[A + B] = a1[A];
                A++;
                continue;
            }
            if (A==a1.length)
            {
                result[A + B] = a2[B];
                B++;
                continue;
            }
            if (a1[A] > a2[B]) {
                result[A + B] = a2[B];
                B++;
            }
            else {
                {
                    result[A + B] = a1[A];
                A++;
            }

        }}

        System.out.println(Arrays.toString(result));
    }
}
// В степиковставлялка
//    public static int[] mergeArrays(int[] a1, int[] a2) {
//        int[] result = new int[a1.length + a2.length];
//
//        for (int i = 0, A = 0, B = 0; i < result.length; i++) {
//            if (B==a2.length) {
//                result[A + B] = a1[A];
//                A++;
//                continue;
//            }
//            if (A==a1.length)
//            {
//                result[A + B] = a2[B];
//                B++;
//                continue;
//            }
//            if (a1[A] > a2[B]) {
//                result[A + B] = a2[B];
//                B++;
//            }
//            else {
//                {
//                    result[A + B] = a1[A];
//                    A++;
//                }
//
//            }}
//        return result; // your implementation here
//    }