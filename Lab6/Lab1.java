package lab06;
import java.util.Arrays;

public class Lab1 {

    /**
     * Entry point. Tests the method {@code sortArray(long [] arr)} by calling the helper
     * method {@code printResults(long [] arr)} once.
     *
     * @params long [] arr parameters for {@code sortArray(int [] arr)}.
     */
    public static void main(String[] args) {
        long[] arr = {11, 3, 14, 16, 7};
        printResults(arr);
        long[] arr1 = {-2_147_000_000, 2_000_000,2_147_000_000, -3_000_000, 4_566_554, 5};
        printResults(arr1);
        long[] arr2 = {5, 4, 3, 2, 1};
        printResults(arr2);
        long[] arr3 = {-1, -2, -3, -4, -5};
        printResults(arr3);
        long[] arr4 = {1_111, 112_000_000, 11_113, 147_000_555, 111_115};
        printResults(arr4);
        long[] arr5 = {-8, -199, -434_300_000, -343_400_000, 5445, 5454, 5544, 55554, 5554};
        printResults(arr5);
        long[] arr6 = {555, 0, 5555, 5555, 5555, 5556, 5556, 2, 3, 4, 5};
        printResults(arr6);
        long[] arr7 = {1};
        printResults(arr7);
        long[] arr8 = {};
        printResults(arr8);
        long[] arr9 = {1, 2, (int) Double.NaN, 3, 4, 5};
        printResults(arr9);
    }

    /**
     * Helper method for printing result of {@code sortArray(long [] arr)}
     *
     * @params long [] arr the entire parameter for {@code printResults function }
     */
    static void printResults(long [] arr) {
        try {
            long[] arr1 = new long[arr.length];
            arr1 = sortArray(arr);
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        System.out.println("");
    }

    /**
     * Bubble sort of array
     *
     * @return result the sorted array
     * @params long [][] arr the entire parameter.
     */
    static long[] sortArray(long[] mas) {
        boolean isSorted = false;
        long buf;

          if(mas.length < 1)
        {
            throw new IllegalArgumentException("length of array < 2 ");
        }

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        return mas;
    }
}