import java.math.BigInteger;

public class T_2_4_8 {
    public static void main(String[] args) {
        int VALUE = 0;
        BigInteger valueBigInteger = BigInteger.valueOf(VALUE);
        BigInteger factorial = BigInteger.valueOf(1);
            for (BigInteger i = BigInteger.ONE; i.compareTo(valueBigInteger.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
                factorial = factorial.multiply(i);
        }
        System.out.println(factorial);
    }
}

// В степиковставлялка
//    public static BigInteger factorial(int value) {
//        BigInteger valueBigInteger = BigInteger.valueOf(value);
//        BigInteger factorial = BigInteger.valueOf(1);
//        for (BigInteger i = BigInteger.ONE; i.compareTo(valueBigInteger.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
//            factorial = factorial.multiply(i);
//        }
//        return factorial;
//    }
