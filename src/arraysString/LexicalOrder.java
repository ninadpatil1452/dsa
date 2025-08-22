package arraysString;

public class LexicalOrder {

    /*
    Write a method, lexicalOrder, that takes in 2 words and an alphabet string as an argument.
    The method should return true if the first word should appear before the second word if lexically-ordered according to the given alphabet order.
    If the second word should appear first, then return false.

    Note that the alphabet string may be any arbitrary string.
    Intuitively, Lexical Order is like "dictionary" order:
    You can assume that all characters are lowercase a-z.
    You can assume that the alphabet contains all 26 letters.
     */


    public static boolean lexicalOrder(String word1, String word2, String alphabet) {
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i += 1) {
            char char1 = i < word1.length() ? word1.charAt(i) : '\0';
            char char2 = i < word2.length() ? word2.charAt(i) : '\0';
            int value1 = alphabet.indexOf(char1);
            int value2 = alphabet.indexOf(char2);
            if (value1 < value2) {
                return true;
            } else if (value1 > value2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String alphabet = "ghzstijbacdopnfklmeqrxyuvw";
        System.out.println(lexicalOrder("zoo", "dinner", alphabet));
    }
}
