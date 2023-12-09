
import java.util.*;

public class MergeStringsAlternately {

    static void mergeWords(String s1, String s2) {
        String result = "";
        int i = 0;
        int maxLimit = Math.max(s1.length(), s2.length());

        while (i < maxLimit) {
            if (i < s1.length())
                result += s1.charAt(i);

            if (i < s2.length())
                result += s2.charAt(i);

            i++;

        }

        System.out.println("The final word is: " + result);
    }

    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        mergeWords(word1, word2);
    }

}
