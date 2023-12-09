//! Question: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/submissions/

// Description: Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
// Input: s = "leetcode", k = 3
// Output: 2
// Explanation: "lee", "eet" and "ode" contain 2 vowels.

// So how do we do this ?

// This is an explanation of fixed sliding window approach where we will keep adding the vowels, and as soon as the the window becomes invalid
// we increase the left pointer and also update the currentVowels based on if the one we removed from start
// was a vowel or not

import java.util.HashSet;
import java.util.Set;

class MaximumNumberOfVowels {
    public static int maxVowels(String s, int k) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int left = 0, right = 0;
        int maximumVowels = 0, currentVowels = 0;

        while (right < s.length()) {

            if (vowels.contains(s.charAt(right)))
                currentVowels += 1;

            // if the window is invalid
            if (right - left + 1 > k) {
                if (vowels.contains(s.charAt(left)))
                    currentVowels -= 1;

                left += 1;
            }

            maximumVowels = Math.max(maximumVowels, currentVowels);
            right += 1;
        }

        return maximumVowels;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}