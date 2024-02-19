//! Question: https://leetcode.com/problems/two-sum/
//! Leetcode EASY

// The question is that we are gonna be having an array and we have to find the indices of the two numbers that add up to the target number
// The array is not sorted

//* Brute force */
// Time complexity : O(n^2)
// Space complexity : O(1)
// We use two loops and check for the sum of the two numbers

//* Better approach */
// Time complexity : O(n)
// Space complexity : O(n)
// We use a hashmap. We traverse the array and when we come on a number we will check if the target - number is present in the hashmap or not
// If it is present, we return the indices
// If it is not present, we put the current number and its index in the hashmap

//* Intution */
// The intution is that if we have an array like [1,2,3] and we need a sum of 4
// We come on 1, we check if 4-1 is present in the hashmap or not, then we add 1 to the hashmap
// Next when we will come on 3, we will check if 4-3 (1) is present in the hashmap or not.
// We previously added 1 to the hashmap, so we will get the index of 1 and the index of 3.

import java.util.*;

public class Solution {

    static void twosum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println(map.get(target - arr[i]) + " " + i);
                return;
            } else {
                map.put(arr[i], i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3, 2, 4 };
        int target = 6;

        twosum(arr, target);

    }
}
