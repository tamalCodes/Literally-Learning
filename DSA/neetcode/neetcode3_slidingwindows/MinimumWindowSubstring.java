import java.util.*;

public class MinimumWindowSubstring {

    static boolean includesT(String s, String t) {

        int[] counts_array = new int[52];

        for (int i = 0; i < s.length(); i++) {
            counts_array[Math.abs(s.charAt(i) - 'a')]++;
        }

        for (int i = 0; i < t.length(); i++) {
            counts_array[Math.abs(t.charAt(i) - 'a')]--;
        }

        for (int count : counts_array) {
            if (count < 0)
                return false;
        }

        return true;
    }

    static void findMinWindow(String s, String t) {

        if (s.length() < t.length()) {
            System.out.println("No window found");
            return;
        }

        int left = 0, right = t.length() - 1;
        String minimumWord = "";
        int minimumLength = Integer.MAX_VALUE;

        while (right < s.length()) {
            String s2 = s.substring(left, right + 1);

            if (s2.isEmpty() || !includesT(s2, t)) {
                right++;
            } else {
                System.out.println("Found the word: " + s2);
                if (s2.length() < minimumLength) {
                    minimumWord = s2;
                    minimumLength = s2.length();
                }
                left++;
            }
        }

    }

    static void findMinWindow_Optimized(String s, String t) {
        if (s.length() < t.length()) {
            System.out.println("No window found");
            return;
        }

        HashMap<Character, Integer> required = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // put the characters of t inside the required
        for (int i = 0; i < t.length(); i++) {
            required.put(t.charAt(i), required.getOrDefault(t.charAt(i), 0) + 1);
        }

        // have is the count of the needed characters that we currently have in the
        // window AND need is the actual number of characters that we NEED in the window

        int left = 0, right = 0;
        int have = 0, need = required.size();

        // minimumLength is needed to track if the window is of minimum length,
        // if it is we save the string !

        int minimumLength = Integer.MAX_VALUE;
        String minimumString = "";

        while (right < s.length()) {

            // put the character inside the window

            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // if the current character is what we were looking for
            // we can increase the count of have
            // suppose t=ABC, and the character we get is A
            // so now we have 1 character that we needed.

            // what if we again get A
            // we won't increase 1 this time.
            // so we will increase the have only when, window and required Maps contains the
            // EXACT amount of characters.

            if (required.containsKey(c) && required.get(c).intValue() == window.get(c).intValue())
                have++;

            // now suppose we needed ABC
            // and we have XYZSABC
            // So our HAVE and NEED are equal, but we have extra shit
            // so we can increment our left pointer so that we get rid of extra shit

            // but we also need to make sure that we HAVE what we need.
            // If i remove X,Y,Z,S it will be fine
            // but if i remove A, we don't HAVE what we need

            while (left <= right && have == need) {

                // check if the window is actually a minimum window
                // if it is, then save it
                if (right - left + 1 < minimumLength)
                    minimumString = s.substring(left, right + 1);

                // saving the window is done, now let's remove the left character
                char leftCharacter = s.charAt(left);
                window.put(leftCharacter, window.get(leftCharacter) - 1);

                // now check if what we just removed was actually important
                // How do we check that ?
                // we simply check frequency of both the characters in both the map
                if (required.containsKey(leftCharacter)
                        && window.get(leftCharacter).intValue() < required.get(leftCharacter).intValue())
                    have--;

                left++;

            }

            right++;
        }

        System.out.println(minimumString);
        return;
    }

    public static void main(String[] args) {
        String s = "aahjsABsls", t = "AB";
        findMinWindow_Optimized(s, t);
    }
}
