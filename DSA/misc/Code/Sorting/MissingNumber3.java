//* This is done with CYCLIC SORT */
//* Video link : https://youtu.be/JfinxytTYFQ */
//* Problem : https://leetcode.com/problems/find-the-duplicate-number/description/ */

import java.util.*;

public class MissingNumber3 {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printmyArray(int[] arr) {

        int i = 0;
        System.out.println("The sorted array is : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("The missing numbers are : ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                System.out.print((i + 1) + " ");
        }
    }

    static void useCyclicsort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int j = arr[i] - 1;

                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate number is " + arr[i]);
                    return;
                }

                swap(arr, i, j);

            } else {
                i++;
            }
        }

        // printmyArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 3, 4, 2, 2 };
        useCyclicsort(arr);
    }
}
