package lab07.example.strategies;
import java.util.Arrays;

public class InsertionSort implements SortStrategy {

    /**
     * Entry point. Tests the method {@code sortArray(long [] arr)} by calling the helper
     * method {@code printResults(long [] arr)} once.
     *
     * @params long [] arr parameters for {@code sortArray(int [] arr)}.
     */
    public static void main(String[] args) {
    }

    /**
     * Helper method for printing result of {@code sortArray(long [] arr)}
     *
     * @params long [] arr the entire parameter for {@code printResults function }
     */
     public void printResults(long [] arr) {
         System.out.print("Insertion sort: ");
        try {
            long[] arr1 = new long[arr.length];
            arr1 = sortArray(arr);
            System.out.println(Arrays.toString(arr1));
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        System.out.println("");
    }

    /**
     * Insertion sort of array
     *
     * @return result the sorted array
     * @params long [][] arr the entire parameter.
     */
    public long[] sortArray(long[] sourceArray) {
        long[] destinationArray = new long[sourceArray.length];
        int destinationSize = 0;

        if(sourceArray.length < 1)
        {
            throw new IllegalArgumentException("length of array < 2 ");
        }

        for (int n = 0; n < sourceArray.length; n++) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize && destinationArray[insertIndex] < sourceArray[n]) {
                    insertIndex++;
                }
            }

            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                destinationArray[m + 1] = destinationArray[m];
            }
            destinationArray[insertIndex] = sourceArray[n];
            destinationSize++;
        }
        return destinationArray;
    }
}