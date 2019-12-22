package lab05;

/**
 * Lab 05, Task 3
 *
 * @author Moskalenko Volodymyr
 */

public class Lab3 {

    /**
     * Entry point. Tests the method {@code calculateParams(int [] arr)} by calling the helper
     * method {@code printResults(int [] arr)} once.
     *
     * @params int [] arr parameters for {@code calculateParams(int [] arr)}.
     */
    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        int [][] arr = new int [N][M];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                arr[i][j] = ((int)(Math.random() * 100)/10);
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        printResults(arr);
        int [] arr1 = {1,2,3,4,5};
//        printResults(arr1);
//        int [] arr2 = {5,4,3,2,1};
//        printResults(arr2);
//        int [] arr3 = {-1,-2,-3,-4,-5};
//        printResults(arr3);
//        int [] arr4 = {1111,112,11113,14,111115};
//        printResults(arr4);
//        int [] arr5 = {-8,-199,-4343,-3434,5445,5454,5544,55554,5554};
//        printResults(arr5);
//        int [] arr6 = {555,0,5555,5555,5555,5556,5556,2,3,4,5};
//        printResults(arr6);
//        int [] arr7 = {1};
//        printResults(arr7);
//        int [] arr8 = {};
//        printResults(arr8);
//        int [] arr9 = {1,2,(int)Double.NaN,3,4,5};
//        printResults(arr9);

    }

    /**
     * Helper method for printing result of {@code calculateParams(int [][] arr)}
     *
     * @params int [][] arr the entire parameter for {@code printResults function }
     */
    static void printResults(int [][] arr) {
        int res = 0;
        int N = 5 ;
        int M = 5;
        try {
            int [][] arr1 = new int [N][M];
            arr1 = calculateParams(arr);
            for (int i=0; i < arr1.length ; i++) {
                for (int j=0; j < arr1[i].length; j++) {
                    System.out.print( arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (IllegalArgumentException e){
        }
    }
    /**
     * Returns the math calculated result
     *
     * @params int [][] arr the entire parameter.
     * @return result of math operations
     */
    static int [][] calculateParams(int [][] arr) {

//        if(arr2.length < 2)
//        {
//            throw new IllegalArgumentException("length = 0 ");
//        }
        int N = 5, M = 5;
        int ch =0;
        int max = arr[0][0];
        int min = arr[0][0];
        int max_line = 0 ;
        int min_line = 0;

        for (int t = 0; t < arr.length; t++) {
            for (int s = 0; s < arr[t].length; s++) {
                if (arr[t][s] > max){
                    max = arr[t][s];
                    max_line = s;
                }
                if (arr[t][s] < min){
                    min = arr[t][s];
                    min_line = s;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if ( (arr[k][l] == max) && (l > max_line) ){
                    max_line = l;
                }
            }
        }

        for (int p = 0; p < arr.length; p++) {
            for (int r = 0; r < arr[p].length; r++) {
                if ( (arr[p][r] == min) && (r < min_line)){
                    min_line = r;
                }
            }
        }
        System.out.println("max line: " + max_line  + " min line: "+ min_line);
        System.out.println("max : " + max + " min : "+ min);

        for (int i=0; i< M; i++) {
            ch = arr[i][max_line];
            arr[i][max_line] = arr[i][min_line];
            arr[i][min_line] = ch;
        }

        return arr;
    }
}

