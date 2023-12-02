import java.util.Arrays;

public class T_2_4_9 {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 4, 6};
        int[] a2 = new int[]{1, 3, 5};
        int[] result = new int[a1.length + a2.length];
        int a = 0;
        int b = 0;
        int endA1 = a1.length;
        int endA2 = a2.length;
        for (int i = 0; i < result.length; i++) {
            if (a < endA1 && (b >= endA2 || a1[a] < a2[b])) {
                result[a + b] = a1[a];
                a++;
            } else {
                result[a + b] = a2[b];
                b++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}


// В степиковставлялка
//    public static int[] mergeArrays(int[] a1, int[] a2) {
//        int[] result = new int[a1.length + a2.length];
//        int A = 0;
//        int B = 0;
//        int endA1 = a1.length;
//        int endA2 = a2.length;
//        for (int i = 0; i < result.length; i++) {
//            if (A < endA1 && (B >= endA2 || a1[A] < a2[B])) {
//                result[A + B] = a1[A];
//                A++;
//            } else {
//                result[A + B] = a2[B];
//                B++;
//            }
//
//        }
//
//        return result; // your implementation here
//    }