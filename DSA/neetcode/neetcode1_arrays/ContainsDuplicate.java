//! QUESTION:  https://leetcode.com/problems/contains-duplicate/
//! Leetcode EASY

//* DESC */
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//* Brute force */
// Time complexity : O(n^2)
// Space complexity : O(1)
// We will take each element and check if it is present in the array again or not

//* Optimized */
// Time complexity : O(n)
// Space complexity : O(n)
// We will use a hashset to store the elements and check if the element is already present in the hashset or not
// as soon as we find a duplicate we will return true

import java.util.*;

public class ContainsDuplicate {

    static void checkDuplicate(int[] arr) {
        Set<Integer> mySet = new HashSet<>();

        for (int element : arr) {
            if (mySet.contains(element)) {
                System.out.println("Duplicate is present");
                return;
            } else {
                mySet.add(element);
            }
        }

        System.out.println("Distinct array");

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        checkDuplicate(arr);
    }

}
