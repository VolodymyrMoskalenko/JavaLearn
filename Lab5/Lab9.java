package lab05;

/**
 * Lab 05, Task 3
 *
 * @author Moskalenko Volodymyr
 */

public class Lab9 {

    /**
     * Entry point. Tests the method {@code calculateParams(int [] arr)} by calling the helper
     * method {@code printResults(int [] arr)} once.
     *
     * @params int [] arr parameters for {@code calculateParams(int [] arr)}.
     */
    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        int[][] arr = new int[N][M];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * 100) / 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        printResults(arr);
    }

    /**
     * Helper method for printing result of {@code calculateParams(int [][] arr)}
     *
     * @params int [][] arr the entire parameter for {@code printResults function }
     */
    static void printResults(int[][] arr) {
        int res = 0;
        int N = 5;
        int M = 5;
        try {
            int count = Counter(arr);
            int[] arr1 = new int[count*3];
            arr1 = calculateParams(arr);
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        } catch (IllegalArgumentException e) {
        }
    }

    /**
     * Returns the math calculated result
     *
     * @return result of math operations
     * @params int [][] arr the entire parameter.
     */
    static int[] calculateParams(int[][] arr) {
        int N = 5, M = 5;

        int count = Counter(arr);

        int[] arr2 = new int[count*3];
        int st = 0;
        for (int t = 0; t < arr.length; t++) {
            for (int s = 0; s < arr[t].length; s++) {
                if (arr[t][s] != 0) {
                    arr2[st] = t;
                    arr2[st + 1] = s;
                    arr2[st + 2] = arr[t][s];
                    st += 3;
                }
            }
        }
        return arr2;
    }
    /**
     * Returns the count of non-null variables
     *
     * @return count
     * @params int [][] arr the entire parameter.
     */
    static int Counter(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }

        }
        return count;
    }

}