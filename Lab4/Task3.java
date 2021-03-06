package lab04;

/**
 * Lab 04, Task 3
 *
 * @author Moskalenko Volodymyr
 */
public class Task3 {

    /**
     * Entry point. Tests the method {@code calculateParams(int [] arr)} by calling the helper
     * method {@code printResults(int [] arr)} once.
     *
     * @params int [] arr parameters for {@code calculateParams(int [] arr)}.
     */
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        printResults(arr1);
        int [] arr2 = {5,4,3,2,1};
        printResults(arr2);
        int [] arr3 = {-1,-2,-3,-4,-5};
        printResults(arr3);
        int [] arr4 = {1111,112,11113,14,111115};
        printResults(arr4);
        int [] arr5 = {-8,-199,-4343,-3434,5445,5454,5544,55554,5554};
        printResults(arr5);
        int [] arr6 = {555,0,5555,5555,5555,5556,5556,2,3,4,5};
        printResults(arr6);
        int [] arr7 = {1};
        printResults(arr7);
        int [] arr8 = {};
        printResults(arr8);
        int [] arr9 = {1,2,(int)Double.NaN,3,4,5};
        printResults(arr9);

    }

    /**
     * Helper method for printing result of {@code calculateParams(int [] arr)}
     *
     * @params int [] arr the entire parameter for {@code printResults function }
     */
    static void printResults(int [] arr) {
        int res = 0;

        try {
            res = calculateParams(arr);
            System.out.println(res);
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }
    /**
     * Returns the math calculated result
     *
     * @params int [] arr the entire parameter.
     * @return result of math operations
     */
    static int calculateParams(int [] arr) {
        if(arr.length < 1)
        {
            throw new IllegalArgumentException("length = 0 ");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}

