//! Question: https://leetcode.com/problems/longest-consecutive-sequence/

//* Description: Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time. */

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

// The approach is simple, we add all the elements to the array, then we go to each element
// first we check if element-1 exists, if it does, we skip. WHY ? 

// If we have [5,4,1,2,3], and arr[i] is 5
// It is pretty obvious that largest seq = 1,2,3,4,5
// So no need to check for 5, keep going until we get 1

// Then when we have 1, we run a while loop, and it will go 1,2,3,4,5 || Total = 5

import java.util.*;

class LongestConsecutiveSequence {

    static void addAllElements(int[] arr, Set<Integer> hashset) {

        for (int i = 0; i < arr.length; i++) {
            hashset.add(arr[i]);
        }
    }

    static void calculateLongest(int[] arr, Set<Integer> hashset) {

        // adding all the elements of the array to the hashset
        addAllElements(arr, hashset);

        // default values
        int total = 1;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            // If we have [5,4,1,2,3], and arr[i] is 5
            // It is pretty obvious that largest seq = 1,2,3,4,5
            // So no need to check for 5, keep going until we get 1

            // After we get 1, (smallest), continue from there
            if (!hashset.contains(arr[i] - 1)) {

                int element = arr[i] + 1;

                // as long we are having the next element
                // we keep increasing the total, and keep going to the next element
                // If we have [ 5,3,1,2], we would start with 1, element would be 2

                // If 2 is present, update total
                // Then we again check for 3, if present update total
                // Then we again check for 4, if present update total

                while (hashset.contains(element)) {
                    total++;
                    element++;
                }

                // basically storing the max value

                if (total > max)
                    max = total;

                // reset the total for next element in the arr
                total = 1;
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        calculateLongest(arr, hashset);
    }
}
