package lab09;

import java.util.Arrays;

/**
 * Lab 09, Task 3
 *
 * @author Moskalenko Volodymyr
 */
public class Task3 {

    /**
     * Entry point. Tests the method {@code intToOctString(int i)} by calling the helper
     * method {@code printResults(int) } once.
     *
     * @params int parameter for {@code intToOctString(int i)}.
     */
    public static void main(String[] args) {
        int data1 = 844;
        printResults(data1);
        int data2 = 555;
        printResults(data2);
        int data3 = 0;
        printResults(data3);
        int data4 = -9;
        printResults(data4);

    }

    /**
     * Helper method for printing result of {@code intToOctString(int i)}
     *
     * @params int the entire parameter for {@code printResults function }
     */
    static void printResults(int data) {
        String res ;

        try {
            res = intToOctString(data);
            System.out.println(res);
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }
    /**
     *Returns the octal number
     *
     * @params int data the entire parameter.
     * @return result of math operations
     */
    static String intToOctString(int data) {
        if(data < 0) {
            throw new IllegalArgumentException("Number is negative");
        }
        if(data == 0)
        {
            return "0";
        }

        int a[] = new int[10];
        int i = 1;
        String str = "";
        while(data != 0)
        {
            a[i++] = data%8;
            data = data/8;
        }
        for(int c=i-1;c>0;c--)
        {
            str += Integer.toString(a[c]);
        }
        return str;
    }
}

