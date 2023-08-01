
//! QUESTION: https://leetcode.com/problems/valid-anagram/
//! Leetcode EASY

//* DESC */

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once.

//* Brute force */

// Time complexity : O(n^2)
// Space complexity : O(1)

// We will take each element and check if it is present in the array again or not, if it is present we will remove it from the array
// if it is not present we will return false

//* Optimized */

// Time complexity : O(n)
// Space complexity : O(n)

// Using an array of size 26 we will store the count/frequency of each character that is present in the string s

// Think logically if we have "tab" and "bat"

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

// If after both the operation there is an element in the array
// whos val is not 0, that means the anagraam is not valid

// CAR, RAT

// CAR
// Suppose, c-a = 2
// Suppose, a-a = 0
// Suppose, r-a = 3
// So we increment c[2], c[0], c[3] from 0 to 1

// BAT
// Suppose, r-a = 3
// Suppose, a-a = 0
// Suppose, t-a = 1 --> MINUS -1 
// So we decrement c[3], c[0], c[1] from 1 to 0

import java.util.*;

public class ValidAnagram {

    static boolean validAna(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] counts_array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts_array[s.charAt(i) - 'a']++;
            counts_array[t.charAt(i) - 'a']--;
        }

        for (int count : counts_array) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean hello = validAna("tamal", "talma");
        System.out.println(hello);
    }

}
