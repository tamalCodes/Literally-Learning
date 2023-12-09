
//Question: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//* EASY */

// Question means: [1,2,3,1,1,1,1]
// My K is given as 3, so i need to find the length of the longest subarray whose sum is 3

import java.util.*;

public class LongestSubarray {

    static void findLongest(int[] arr, int k) {
        int left = 0, right = 0;
        int maxCounter = 0, counter = 0, sum = 0;

        while (right < arr.length) {
            sum += arr[right];
            counter++;

            while (sum > k) {
                sum -= arr[left];
                left++;
                counter--;
            }

            if (sum == k) {
                maxCounter = Math.max(maxCounter, counter);
                sum = 0;
                counter = 0;
                left = right + 1;
            }

            right++;

        }

        System.out.println("The highest number of ones are : " + maxCounter);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 1, 1, 0, 2, 3, 1, 0, 1, 1, 1, 1, 1 };
        findLongest(arr, 5);
    }
}