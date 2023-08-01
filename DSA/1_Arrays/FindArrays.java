//*Question: https://leetcode.com/problems/find-the-duplicate-number/  */

//^ Intuition behind the findDup() method
//^ we are using two pointers i and j
//^ we are comparing the elements of the array at the pointers i and j
//^ if the elements are not equal, then we are incrementing the pointer i and decrementing the pointer j
//^ if the elements are equal, then we are printing the element and breaking out of the loop

import java.util.*;

public class solution {

    static void findDup(int[] arr) {

        int i = 0, j = arr.length - 1;

        while (i < arr.length && j >= 0) {
            if (arr[i] != arr[j]) {
                i++;
                j--;
            } else {
                System.out.println("The duplicate element is : " + arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 1, 3, 4, 2 };
        findDup(arr);
    }
}
