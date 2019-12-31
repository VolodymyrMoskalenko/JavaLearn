package lab09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Lab 09, Task 9
 *
 * @author Moskalenko Volodymyr
 */
public class Task9 {

    /**
     * Entry point. Tests the method {@code separateDataAndNumbers(String str)} by calling the helper
     * method {@code printResults(String) } once.
     *
     * @params str parameter for {@code separateDataAndNumbers(String str)}.
     */
    public static void main(String[] args) {
        String data1 = "strfd eree drfldgdgdgdfg egergessv";
        printResults(data1);
        String data2 = "555 4444 4444 4444";
        printResults(data2);
        String data3 = "dfdsfse 0grgrgw drt44g dgg 000fw3 44403 40044";
        printResults(data3);
        String data4 = "Dadad fgtrdgd 5trtetr r5454";
        printResults(data4);

    }

    /**
     * Helper method for printing result of {@code separateDataAndNumbers(String str)}
     *
     * @params String the entire parameter for {@code printResults function }
     */
    static void printResults(String str) {
        int res;

        try {
            res = separateDataAndNumbers(str);
            System.out.println(res);
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }




    /**
     *Returns the octal number
     *
     * @params String str the entire parameter.
     * @return count of entries numbers and strings
     */
    static int separateDataAndNumbers(String str) {
//        if(data < 0) {
//            throw new IllegalArgumentException("Number is negative");
//        }
        String template = "([0-9A-Za-z]+)";
        int count = 0;
        String[] words=str.split("\\s");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println("ping");
            if( isMatchingRegexp(w,template) )
            {
                System.out.println("pong");
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
    static boolean isMatchingRegexp( String text,  String template)
    {
        Pattern pattern = null;
        try
        {
            pattern = Pattern.compile(template);
        }
        catch(PatternSyntaxException e)
        {
            e.printStackTrace();
        }
        if(pattern == null)
        {
            return false;
        }
        final Matcher regexp = pattern.matcher(text);
        return regexp.matches();
    }

}

