//* Question: https://leetcode.com/problems/merge-sorted-array/ */

//^ Intuition behind the mergearray() method
//^ we are using two pointers i and j
//^ we are comparing the elements of the two arrays
//^ if the element of the first array is smaller than the element of the second array, then we are incrementing the pointer i
//^ if the element of the first array is greater than the element of the second array, then we are swapping the elements and incrementing the pointer i and j

//^ if the element of the first array is 0, then we are swapping the elements and incrementing the pointer i and j
//^ The goal is to have a sorted arr1 array.

import java.util.*;

public class solution {

    static void swap(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergearray(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                swap(arr1, arr2, i, j);
                i++;
                j++;
            } else {
                i++;
            }

        }

        i = 0;

        while (i < arr2.length) {
            arr1[arr2.length + i] = arr2[i];
            i++;
        }

        printArray(arr1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 0 };
        int[] arr2 = { 1 };

        int m = 3, n = 3;

        mergearray(arr1, arr2, m, n);
    }
}
