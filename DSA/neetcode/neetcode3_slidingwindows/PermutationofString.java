//! https://leetcode.com/problems/permutation-in-string/description/
//! LEETCODE MEDIUM

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// s1=porn
// s2=aksdhjkdhajkorpnasdas

// so we found a permutation of s1 in s2, that is orpn

// How are we doing this ? 
// We are using a sliding window technique
// We are taking a window of size s1.length() and we are checking if it is a permutation of s1 or not
// If it is a permutation we return true
// If it is not a permutation we slide the window by 1 and check again

// How are we checking if it is a permutation or not ?
// We are using an array of size 26 and we are storing the count of each character in the array

// TAB
// Suppose, t-a = 1
// Suppose, a-a = 0
// Suppose, b-a = 2
// So we increment c[1], c[0], c[2] from 0 to 1

// BAT
// Suppose, b-a = 2
// Suppose, a-a = 0
// Suppose, t-a = 1
// So we decrement c[2], c[0], c[1] from 1 to 0

// If after both the operation there is an element in the array whos val is not 0, that means the permutation is not valid
// so we don't return true

import java.util.HashMap;

public class PermutationofString {

    static boolean validPermutation(String s1, String t) {

        if (s1.length() != t.length())
            return false;

        int[] counts_array = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            counts_array[s1.charAt(i) - 'a']++;
            counts_array[t.charAt(i) - 'a']--;
        }

        for (int count : counts_array) {
            if (count != 0)
                return false;
        }

        return true;
    }

    static void runPermutation(String s1, String s2) {

        if (s1.length() > s2.length()) {
            System.out.println("No permutations found");
            return;
        }

        int left = 0, right = left + s1.length() - 1;

        while (right < s2.length()) {
            String s2_substring = s2.substring(left, right + 1);
            if (validPermutation(s1, s2_substring)) {
                System.out.println("Found a permutation: " + s2_substring);
                return;
            }
            left++;
            right++;
        }

    }

    public static void main(String[] args) {
        String s1 = "aoo";
        String s2 = "eidabaoao";
        runPermutation(s1, s2);
    }

}
