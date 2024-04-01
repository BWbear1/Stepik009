import java.util.Objects;

public class T_3_4_9 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.1, 1.1);
        ComplexNumber b = new ComplexNumber(1.1, 1.1);
        System.out.println(a.equals(b));
        System.out.println("a.hashCode():" + a.hashCode() + " b.hashCode():" + b.hashCode());
    }


    public static final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }
        @Override
        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if (anObject == null || getClass() != anObject.getClass()) {
                return false;
            }
            ComplexNumber test = (ComplexNumber) anObject;
            //return (re == test.re && im == test.im);
            return (Double.compare(test.re,re)==0 && Double.compare(test.im, im)==0);
        }
        @Override
        public int hashCode() {
            final int T = 29;
            int reint = Double.hashCode(re);
            int imint =Double.hashCode(im);
            int result = 1;
            result = T * result + reint;
            result = T * result + imint;
            return result;
        }
//        @Override
//        public int hashCode() {
//int B =Double.hashCode(re);
//int C = Double.hashCode(im);
//int result=B;
//result=C;
//return result;
//        }
    }
}