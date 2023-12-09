//! Question: https://leetcode.com/problems/max-consecutive-ones/
//* EASY */

// Given a binary array of nums we need to return the max number of consequite ones
// The intuiton is simple we traverse through the whole array and once we face a non 1, we reset the count.

import java.util.*;

public class MaximumConsecutiveOnes {
    static void countOnes(int[] arr) {

        int counter = 0, maxcon = -1, i = 0;
        while (i < arr.length) {
            if (arr[i] == 1)
                counter++;
            else {
                maxcon = Math.max(maxcon, counter);
                counter = 0;
            }

            i++;
        }

        maxcon = Math.max(maxcon, counter);
        System.out.println("The maximum number of ones are:  " + maxcon);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1 };
        countOnes(arr);

    }
}
