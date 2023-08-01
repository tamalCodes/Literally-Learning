//! QUESTION: https://leetcode.com/problems/product-of-array-except-self/
//! LEETCODE MEDIUM

//* Description */

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

//* A possibility */
// We could have traversed the entire array and calculated the product of all the elements
// Then we could have traversed the array again and divided the product by the current element
// But since the question says that we cannot use division, we cannot use this approach

//* Solution 1 & 2*/

import java.util.*;

class bruteForce {

    static void runBrute(int[] arr) {
        int[] output = new int[arr.length];
        int[] leftProducts = new int[arr.length];
        int[] rightProducts = new int[arr.length];

        leftProducts[0] = 1;
        rightProducts[arr.length - 1] = 1;

        for (int i = 1; i < arr.length; i++) {
            leftProducts[i] = arr[i - 1] * leftProducts[i - 1];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            rightProducts[i] = arr[i + 1] * rightProducts[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
            System.out.print((leftProducts[i] * rightProducts[i]) + " ");
        }

    }

}

public class ProductofArrayExceptSelf {

    static void runOptimal(int[] arr) {
        int[] output = new int[arr.length];

        output[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            output[i] = arr[i - 1] * output[i - 1];
        }

        int rightProductUntilNow = 1;

        for (int i = output.length - 1; i >= 0; i--) {
            output[i] = output[i] * rightProductUntilNow;
            rightProductUntilNow *= arr[i];
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4 };
        bruteForce.runBrute(arr);
        System.out.println("");
        runOptimal(arr);
    }
}
