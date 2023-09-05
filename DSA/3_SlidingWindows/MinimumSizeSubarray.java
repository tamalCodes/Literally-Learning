//! Question: https://leetcode.com/problems/minimum-size-subarray-sum/

// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

// How do we do it ?

// We basically go through the whole array with a sliding window approach, the window is greedy one
// we keep incrementing right and as soon we are greater we run a while loop

// we do  while (sum - arr[left] >= target) because if we are removing an element we want to make sure that if I remove the first element
// the sum won't be less than the target

// and in  the end we get ourselves the minLength

public class MinimumSizeSubarray {
    public static int minSubArrayLen(int target, int[] arr) {

        int minLength = Integer.MAX_VALUE;
        int left = 0, right = 0;
        int sum = 0;

        while (right < arr.length) {

            sum += arr[right];
            System.out.println("Sum before the loop: " + sum);

            while (sum - arr[left] >= target) {
                sum -= arr[left];
                left++;
            }

            System.out.println("Sum after the loop: " + sum);

            if (sum >= target)
                minLength = Math.min(minLength, right - left + 1);

            right++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(minSubArrayLen(11, arr));
    }

}
