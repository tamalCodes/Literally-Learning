// Question: https://leetcode.com/problems/length-of-last-word/description/

// Approach: We need to find the length of the last word in the string
// We run a loop from the end and we will increment the count if it is not a space
// IF we have covered a word that means count !=0 and we got a space we break
// so now the count  is basically the length of the word

public class LengthOfLast {
    public static int lengthOfLastWord(String s) {

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (count != 0 && s.charAt(i) == ' ')
                break;

            if (s.charAt(i) != ' ')
                count++;

        }

        return count;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
