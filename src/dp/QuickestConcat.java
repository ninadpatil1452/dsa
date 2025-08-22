package dp;

import java.util.List;

/*
Write a method, quickestConcat, that takes in a string and a list of words as arguments.
The method should return the minimum number of words needed to build the string by concatenating words of the list.
If it is not possible to build the string, then return -1.

You may use words of the list as many times as needed.
 */

public class QuickestConcat {

    public static int quickestConcat(String s, List<String> words) {

        //Base case to check length of the main string
        if (s.length() == 0) {
            return 0;
        }

        //variable to compare and store the min value
        int minValue = Integer.MAX_VALUE;

        for (String word : words) {
            //Checking where string starts with the actual word
            if (s.startsWith(word)) {
                //recursively calling method by removing previous matched word
                int result = quickestConcat(s.substring(word.length()), words);

                //computing minimum value
                if (result != -1) {
                    minValue = Math.min(minValue, 1 + result);
                }
            }
        }

        //handling if no words matched case
        return minValue == Integer.MAX_VALUE ? -1 : minValue;
    }

    public static void main(String[] args) {

        System.out.println(quickestConcat("caution", List.of("ca", "ion", "caut", "ut")));

    }
}
