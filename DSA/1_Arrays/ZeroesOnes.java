//! QUESTION: https://leetcode.com/problems/sort-colors/
//! LEETCODE MEDIUM

//*Description: We are given an array of 0, 1, 2. The idea is to sort them in a manner such that the array looks like : 000001111122222222 */

// The brute force can be to sort everything up 
// But then we need to optimize it

// We also call this as Dutch national flag problem
// The intuition is to maintain 3 different pointer Low, mid, high
// We play only with mid. LOW & HIGH are just swappables.

//& Everything to the left of LOW 000000
//& Everything to the right of HIGH 2222

// We start Low and Mid at 0, High at the last index.
// We play with mid. 

// If mid==0, we swap low and mid, and low++  (because to the left of low  we need 000)
// If mid==2, we swap high and mid, and high-- (because to the right of high  we need 222)

// This way we traverse and then finally we are done !

import java.util.*;

public class Optimal {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void runOptimal(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                mid++;
                low++;
            } else if (arr[mid] == 1)
                mid++;

            else {
                swap(arr, mid, high);
                high--;
            }
        }

        System.out.println("The sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 0, 1 };

        runOptimal(arr);
    }
}
