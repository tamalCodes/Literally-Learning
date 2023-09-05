//! Question: https://leetcode.com/problems/contains-duplicate-ii/
// Input: nums = [1,2,3,1], k = 3
// Output: true

//! Description
// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that 
// nums[i] == nums[j] and abs(i - j) <= k.

// in [1,2,3,1] we have arr[0] == arr[3], and 3-0 = 3 (which is less than or equal to k)

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            // this indicates arr[i]==arr[something that has been added already]
            if (map.containsKey(arr[i])) {

                // get the index of the same number
                // that was previously added to the map

                int j = map.get(arr[i]);

                if (Math.abs(i - j) <= k)
                    return true;
            } else {
                map.put(arr[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        System.out.println(containsNearbyDuplicate(arr, 2));
    }
}
