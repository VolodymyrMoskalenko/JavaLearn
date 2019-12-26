package lab07.example.strategies;

public class SelectionSort implements SortStrategy {

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
        System.out.print("Selection sort: ");
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
     * Selection sort of array
     *
     * @return result the sorted array
     * @params long [][] arr the entire parameter.
     */
    public long[] sortArray(long[] arr) {

            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[min_idx]) {
                        min_idx = j;
                    }
                }

                long temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        return arr;
    }

}