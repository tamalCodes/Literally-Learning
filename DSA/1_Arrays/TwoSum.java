// ! QUESTION: https://leetcode.com/problems/two-sum/
// ! EASY

//* Description */
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// Brute force would be
// run through all the elements in the array, if any 2 of them adds up return

// Optimized would be to maintain a hashmap

// first i get 2, i chechk for 9-2 = 7 in the map
// then i just add 2

// then i get 7, check for 9-7 = 2 in the map
// i get 2 in the map
// result[0] = 2 ka index
// result[1] = 7 ka index

import java.util.*;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };

        int[] result = twoSum(nums, 9);

    }

}