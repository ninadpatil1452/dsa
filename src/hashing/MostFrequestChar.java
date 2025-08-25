package hashing;

import java.util.HashMap;

public class MostFrequestChar {

    /*
    Write a function, mostFrequentChar, that takes in a string as an argument.
    The function should return the most frequent character of the string.
    If there are ties, return the character that appears earlier in the string.
    You can assume that the input string is non-empty.
     */

    public static char mostFrequentChar(String s) {

        char solution = '\0';
        int maxCount = Integer.MIN_VALUE;

        HashMap<Character, Integer> wordCount = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(wordCount.containsKey(s.charAt(i))) {
                wordCount.put(s.charAt(i), wordCount.get(s.charAt(i)) + 1);
            } else  {
                wordCount.put(s.charAt(i), 1);
            }

            if(wordCount.get(s.charAt(i)) > maxCount) {
                maxCount = wordCount.get(s.charAt(i));
                solution = s.charAt(i);
            }

        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("zzzbbbbazaaabvbfz234213421zzsfsdczzza"));
    }

}
