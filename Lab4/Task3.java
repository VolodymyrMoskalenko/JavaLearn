package lab04;
import java.util.Arrays;


/**
 * Lab 03, Task 8
 *
 * @author Moskalenko Volodymyr
 */
public class Task3 {

    /**
     * Entry point. Tests the method {@code calculateParams(t,n)} by calling the helper
     * method {@code printResults(t,n)} once.
     *
     * @params t,n parameters for {@code calculateParams(t,n)}.
     */
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        printResults(arr1);


    }

    /**
     * Helper method for printing result of {@code calculateParams(t,n)}
     *
     * @params t,n the entire parameter for {@code printResults function }
     */
    static void printResults(int [] arr) {
        double res = 0;

        try {
            res = calculateParams(arr);
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
    static double calculateParams(int [] arr) {
        double result = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        //List b = Arrays.asList(ArrayUtils.toObject(a));

        System.out.println("Max " + max);
        //System.out.println(Collections.max(b));
        return (double)max;
    }
}

