package second;

public class Methods {
    public static void checkOnExceptions(double a, double b) throws Exception{
        if ((a < 0) && (b < 0))
            throw new MyException("IllegalArgumentException");
        else if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0)))
            throw new MyException("ArithmeticException");
        else if ((a == 0) && (b == 0))
            throw new MyException("IllegalAccessException");
        else if ((a > 0) && (b > 0))
            throw new MyException("MyException");
    }
    public static void minus(double a, double b) throws Exception {
        checkOnExceptions(a, b);
        System.out.println((a - b));
    }
    public static void plus(double a, double b) throws Exception {
        checkOnExceptions(a, b);
        System.out.println((a + b));
    }
    public static void multiply(double a, double b) throws Exception {
        checkOnExceptions(a, b);
        System.out.println((a * b));
    }
    public static void divide(double a, double b) throws Exception {
        checkOnExceptions(a, b);
        System.out.println((a / b));
    }
}
