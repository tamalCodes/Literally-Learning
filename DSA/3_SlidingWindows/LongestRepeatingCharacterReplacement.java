//! https://leetcode.com/problems/longest-repeating-character-replacement/
// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. 
// You can perform this operation at most k times.
// Return the length of the longest substring containing the same letter you can get after performing the above operations.

import java.util.*;

public class LongestRepeatingCharacterReplacement {

    public static int findMaxValue(Map<Character, Integer> hashmap) {
        int maxValue = Integer.MIN_VALUE; // Initialize the maximum value to the smallest possible integer

        for (int value : hashmap.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    static void runBrute(String s, int k) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        char[] charArray = s.toCharArray();

        int left = 0, right = 0, maxLength = 0;
        while (right < charArray.length) {
            myMap.put(charArray[right], myMap.getOrDefault(charArray[right], 0) + 1);
            maxLength = Math.max(maxLength, right - left + 1);

            int value = right - left + 1 - findMaxValue(myMap);
            System.out.println(value);
            if (value <= k) {
                right++;
            } else {
                System.out.println("We are here when right is: " + charArray[right]);
                myMap.put(charArray[left], myMap.get(charArray[left]) - 1);
                maxLength -= 1;
                left++;
                right++;
            }
        }

        System.out.println(maxLength);
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 1;
        runBrute(s, k);
    }
}