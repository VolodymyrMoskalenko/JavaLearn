package lab02;

/**
 * Lab 02, Task 8
 *
 * @author Moskalenko Volodymyr
 */
public class Task8 {

    /**
     * Entry point. Tests the method {@code calculateParams(a,b,c,d)} by calling the helper
     * method {@code printResults(a,b,c,d)} once.
     *
     * @params a,b,c,d parameters for {@code calculateParams(a,b,c,d)}.
     */
    public static void main(String[] args) {
        double a = 0.345;
        double b = -2.25;
        double c = 2.65;
        double d = 3.99;
        printResults(a, b, c, d);
    }

    /**
     * Helper method for printing result of {@code calculateParams(a,b,c,d)}
     *
     * @params a,b,c,d the entire parameter for {@code printResults function }
     */
    static void printResults(double a, double b, double c, double d) {
        double res = 0;
        System.out.print("a:" + a + " b:" + b + " c:" + c + " d:" + d + " result:");
        res = calculateParams(a, b, c, d);
        System.out.print((Math.round(res*100))/100.0);
    }
    /**
     * Returns the math calculated result
     *
     * @params a,b,c,d the entire parameter.
     * @return result of math operations
     */
    static double calculateParams(double a, double b, double c, double d) {
        double result = ((5*a)/Math.sin(a)) + (Math.sqrt((Math.tanh(Math.abs(b)*c))/Math.log(d)));
        return result;
    }
}
