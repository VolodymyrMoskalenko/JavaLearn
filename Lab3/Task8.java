package lab03;

/**
 * Lab 03, Task 8
 *
 * @author Moskalenko Volodymyr
 */
public class Task8 {

    /**
     * Entry point. Tests the method {@code calculateParams(t,n)} by calling the helper
     * method {@code printResults(t,n)} once.
     *
     * @params t,n parameters for {@code calculateParams(t,n)}.
     */
    public static void main(String[] args) {
        printResults(1,1);
        printResults(10,2);
        printResults(1,0);
        printResults(0,1);
        printResults(10,15);
        printResults(10,-2);
        printResults(4,6);
        printResults(3,3);
        printResults(20,6);
        printResults(8,7);
    }

    /**
     * Helper method for printing result of {@code calculateParams(t,n)}
     *
     * @params t,n the entire parameter for {@code printResults function }
     */
    static void printResults(double t, double n) {
        double res = 0;
        System.out.print("t:" + t + " n:" + n + " result:");

        try {
            res = calculateParams(t, n);
            System.out.println((Math.round(res * 100)) / 100.0);
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }
    /**
     * Returns the math calculated result
     *
     * @params t,n the entire parameter.
     * @return result of math operations
     */
    static double calculateParams(double t, double n) {
        double result = 0;

        if(t <= 0)
        {
            throw new IllegalArgumentException(" param t " + t);
        }

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                result += (2 * i) / Math.sqrt(t);
            } else {
                result += (2*i-1)/t;
            }
        }
        return result;
    }
}
