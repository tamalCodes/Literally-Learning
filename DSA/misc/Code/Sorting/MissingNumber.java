//* This is done with CYCLIC SORT */
//* Video link : https://youtu.be/JfinxytTYFQ */
//* Problem : https://leetcode.com/problems/missing-number/ */

import java.util.*;

public class MissingNumber {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void useCyclicsort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] < arr.length && arr[i] != i) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }

        System.out.println("The sorted array is : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println("The missing number is : " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 3, 0, 1 };
        useCyclicsort(arr);
    }
}
