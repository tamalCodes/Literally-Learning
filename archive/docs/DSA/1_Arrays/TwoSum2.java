//! Question : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//! Leetcode MEDIUM

// The question is that we are gonna be having an sorted array and we have to find the indices of the two numbers that add up to the target number
// Example : [2,7,11,15] target = 9
// Output : [1,2] (indices of 2 and 7)

// Brute force approach would be to use two loops and check for the sum of the two numbers
// Time complexity : O(n^2)

// Better approach would be to use two pointers
// Time complexity : O(n)
// We take two pointers, one at the start and one at the end

// Then we run a while loop, at the start of the loop we'll make total = nums[start] + nums[end]
// If total == target, we return the indices

// If total > target, we decrement the end pointer
// If total < target, we increment the start pointer

import java.util.*;

public class Solution {

    static void twosum(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int total = arr[start] + arr[end];
            if (total == target) {
                System.out.println(start + " " + end);
                return;
            } else if (total > target) {
                end--;
            } else {
                ++start;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        twosum(arr, target);

    }
}
