// ! Question: https://leetcode.com/problems/missing-number/
// * EASY */

// Given an array nums containing n distinct numbers in the range [0, n], return
// the only number in the range that is missing from the array.

// Input: nums = [3,0,1]
// Output: 2
// indexes: [ 0 1 2]
//          [ 0 1 3]
// So as you can see we are missing a two here, so we print the two as an output

public class MissingNumber {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i && arr[i] < arr.length)
                swap(arr, i, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println("The Missing number is: " + i);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        findMissingNumber(arr);

    }
}