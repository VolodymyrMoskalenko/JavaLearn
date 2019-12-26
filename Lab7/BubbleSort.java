package lab07.example.strategies;
import java.util.Arrays;

public class BubbleSort implements SortStrategy{

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
        System.out.print("Bubble sort: ");
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
    public long[] sortArray(long[] mas) {
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