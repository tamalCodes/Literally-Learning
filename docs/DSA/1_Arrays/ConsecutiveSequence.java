//! Question : https://leetcode.com/problems/longest-consecutive-sequence/
//! Leetcode MEDIUM

//? Desc: Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

//* Brute force */
// The obvious method will be to sort and just give the Consecutive sequence which ain't good at all
//TC: O(LogN)

import java.util.*;

public class Solution {

    static void cons(int[] arr) {
        Set<Integer> mySet = new HashSet<>();
        int max = -1;
        int total = 1;

        for (int element : arr) {
            mySet.add(element);
        }

        for (int i = 0; i < arr.length; i++) {

            if (!mySet.contains(arr[i] - 1)) {
                int element = arr[i] + 1;

                while (mySet.contains(element)) {
                    total += 1;
                    element++;
                }

                if (total > max)
                    max = total;

                total = 1;
            }
        }

        System.out.println(max);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        cons(arr);
    }
}
