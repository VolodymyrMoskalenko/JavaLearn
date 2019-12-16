package lab03;

/**
 * Lab 03, Task 13
 *
 * @author Moskalenko Volodymyr
 */
public class Task13 {

    /**
     * Entry point. Tests the method {@code calculateParams(e)} by calling the helper
     * method {@code printResults(e)} once.
     *
     * @params e parameters for {@code calculateParams(e)}.
     */
    public static void main(String[] args) {
        printResults(1);
        printResults(0.5);
        printResults(0.1);
        printResults(-3);
        printResults(15);
        printResults(-12);
        printResults(46);
        printResults(0.3);
        printResults(0.02);
        printResults(8);
    }

    /**
     * Helper method for printing result of {@code calculateParams(e)}
     *
     * @params e the entire parameter for {@code printResults function }
     */
    static void printResults(double env) {
        double res = 0;
        System.out.print("e:" + env + " result:");

        try {
            res = calculateInfelicity(env);
            System.out.println((Math.round(res * 100)) / 100.0);
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }

    /**
     * Returns the math calculated required infelicity
     *
     * @params e the entire parameter.
     * @return result of math operations
     */
    static double calculateInfelicity(double e) {
        double previous,current;
        double sum = 0;
        int i = 1;

        if(e < 0)
        {
            throw new IllegalArgumentException(" param e " + e);
        }

        current = calculateSum(i);
        sum +=current;
        i++;
        do {
            previous = current;
            current = calculateSum(i);
            sum += current;
            i++;
        } while (Math.abs(current - previous) > e);

        return sum;
    }

    /**
     * Returns the math calculated result of expression
     *
     * @params number the entire parameter.
     * @return result of math operations
     */
    static double calculateSum(double number) {
        double result;
        result = Math.pow(-1, number)/factorial(number);
        return result;
    }

    /**
     * Returns the factorial of number
     *
     * @params number the entire parameter.
     * @return result of math operations
     */
    static double factorial(double number) {
        double result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}
