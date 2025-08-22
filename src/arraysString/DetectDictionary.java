package arraysString;

import java.util.List;

public class DetectDictionary {

    /*
    Write a method, detectDictionary, that takes in a dictionary of words and an alphabet string.
    The method should return a boolean,
    indicating whether all words of the dictionary are lexically-ordered according to the alphabet.

    You can assume that all characters are lowercase a-z.
    You can assume that the alphabet contains all 26 letters.
     */
    public static boolean detectDictionary(List<String> dictionary, String alphabet) {

        for(int i = 0; i < dictionary.size() - 1; i++) {
            String word1 = dictionary.get(i);
            String word2 = dictionary.get(i + 1);

            if(!lexicalOrder(word1, word2, alphabet)) {
                return false;
            }
        }
        return true;
    }

    public static boolean lexicalOrder(String word1, String word2, String alphabet) {
        return LexicalOrder.lexicalOrder(word1, word2, alphabet);
    }

    public static void main(String[] args) {

        List<String> dictionary = List.of("miles", "milestone", "pint", "proper", "process", "goal");
        String alphabet = "mnoijpqrshkltabcdefguvwzxy";
        System.out.println(detectDictionary(dictionary, alphabet));
    }
}
