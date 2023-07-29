//! QUESTION: https://leetcode.com/problems/valid-palindrome/
//! LEETCODE EASY

//* DESC */

// Given a string s, return true if it is a palindrome, or false otherwise.

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing al non-alphanumeric characters, it reads he same forward and backward. Alphanumeric characters include letters and numbers.

import java.util.*;

public class ValidPalindrome {

    static void checkPalindrome(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;

        while (j >= i) {

            if (ch[i++] != ch[j--]) {
                System.out.println("Not palindrome");
                return;
            }
        }

        System.out.println("Palindrome");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "amanaplanacanalpanama";

        checkPalindrome(s);
    }

}