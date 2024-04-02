public class T_3_5_7 {

//метод левых прямоугольников

    public static void main(String[] args) {
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double area = 0;
        double h = 0.000001;
        for (int i = 0; i < Math.abs(b-a)/h; i++) {
            area += h * f.applyAsDouble(a+i*h);
        }
return area;

    }
}
