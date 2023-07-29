//! Question: https://leetcode.com/problems/3sum/
//! Leetcode MEDIUM

//* DESC */
// Given an integer array arr, return all the triplets, the solution set must not contain duplicate triplets.

//* Brute force */
// Time complexity : O(n^3)
// Space complexity : O(1)
// We use three loops and check for the sum of the three numbers

//* Optimized */
// Time complexity : O(n^2)
// Space complexity : O(1)

// We have an outer loop to run through the array once , which will be pointed by i.
// Then we have 2 different pointers just like the 2sum, j will be at i+1, k will be at the last.

// Now we move to the first i, play with j,k and try to find out the sum.

//* Duplicacy */
// If we suppose have [ -3, -3, 1, 2, 3, 4] , as you can see we have -3 twice as a result we might get [-3, 1, 2] twice
// That is the reason why we are using the arr[i] == arr[i - 1] check.

// Also suppose we have an array of [0,0,0,0,0,0,0,0,0,0] , this can cause us to have [0,0,0] more times.
// That is why we are using duplicacy checkers for j,k as well.

import java.util.*;

public class Solution {

    static void threesum(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

                    while (j < k && arr[j] == arr[j + 1])
                        j++;

                    while (j < k && arr[k] == arr[k - 1])
                        k--;

                    j++;
                    k--;

                } else if (sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
            }

        }

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0 };
        // int[] arr = { -3, -3, 1, 2, 3, 4 };
        threesum(arr);
    }
}
