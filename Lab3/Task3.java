package lab03;

/**
 * Lab 03, Task 3
 *
 * @author Moskalenko Volodymyr
 */
public class Task3 {

    /**
     * Entry point. Tests the method {@code calculateParams(k,z)} by calling the helper
     * method {@code printResults(k,z)} once.
     *
     * @params k,z parameters for {@code calculateParams(k,z)}.
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
     * Helper method for printing result of {@code calculateParams(k,z)}
     *
     * @params k,z the entire parameter for {@code printResults function }
     */
    static void printResults(double k, double z) {
        double res = 0;
        System.out.print("a:" + k + " b:" + z + " result:");

        try {
            res = calculateParams(k, z);
            System.out.println((Math.round(res * 100)) / 100.0);
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }
    /**
     * Returns the math calculated result
     *
     * @params k,z the entire parameter.
     * @return result of math operations
     */
    static double calculateParams(double k, double z) {
        double result = 0;

        if(k >= 15 || k < 1)
        {
            throw new IllegalArgumentException(" param k " + k);
        }
        if(z <= 0)
        {
            throw new IllegalArgumentException(" param z " + z);
        }

        for(int i = 1; i <=k; i++) {
            result += ((1/(Math.sqrt(z*i)))+(Math.tan(k/i)));
        }
        return result;
    }
}
