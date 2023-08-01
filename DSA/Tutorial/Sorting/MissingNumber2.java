//* This is done with CYCLIC SORT */
//* Video link : https://youtu.be/JfinxytTYFQ */
//* Problem : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/ */

import java.util.*;

public class MissingNumber2 {

    static void swap(int[] arr, int a, int b) {

        if (arr[a] == arr[b]) {
            arr[a] = 0;
            return;
        }

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

            if (arr[i] != 0 && arr[i] != i + 1) {
                int j = arr[i] - 1;
                swap(arr, i, j);

            } else {
                i++;
            }
        }

        printmyArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        useCyclicsort(arr);
    }
}
