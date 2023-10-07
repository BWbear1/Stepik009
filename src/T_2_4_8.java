import java.math.BigInteger;

public class T_2_4_8 {
    public static void main(String[] args) {
        int value = 0;
        BigInteger valueBigInteger = BigInteger.valueOf(value);
        BigInteger Factorial = BigInteger.valueOf(1);
            for (BigInteger i = BigInteger.ONE; i.compareTo(valueBigInteger.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
                Factorial = Factorial.multiply(i);
        }
        System.out.println(Factorial);
    }
}

// В степиковставлялка
//    public static BigInteger factorial(int value) {
//        BigInteger valueBigInteger = BigInteger.valueOf(value);
//        BigInteger Factorial = BigInteger.valueOf(1);
//        for (BigInteger i = BigInteger.ONE; i.compareTo(valueBigInteger.add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)) {
//            Factorial = Factorial.multiply(i);
//        }
//        return Factorial;
//    }
