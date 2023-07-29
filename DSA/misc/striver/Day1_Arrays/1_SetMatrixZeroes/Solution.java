// Questions: https://leetcode.com/problems/set-matrix-zeroes
//! LEETCODE MEDIUM

//* Description */
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // BruteForce.BruteMain();
        // Optimal.OptimalMain();
    }
}

class BruteForce {

    // We will have to iterate through the entire matrix
    // As soon as we find a 0 we make it -1
    // Then we run 2 different functions to transform the rows and columns
    // We make the rows and cols of them as -1

    // Once the loop has ended we run another loop to transform the -1 to 0

    static void transformRows(int[][] arr, int row) {
        for (int j = 0; j < arr[row].length; j++) {
            if (arr[row][j] != 0)
                arr[row][j] = -1;
        }

    }

    static void transformColumns(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != 0)
                arr[i][col] = -1;
        }
    }

    static void changetoZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1)
                    arr[i][j] = 0;
            }
        }
    }

    public static void BruteMain() {

        int[][] arr = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 },
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = -1;
                    transformRows(arr, i);
                    transformColumns(arr, j);
                }
            }
        }

        changetoZero(arr);

    }
}

class Optimal {

    // here instead of doing so many traversals each time
    // we will simply maintain 2 different arrays

    // dummyRow will be track je kon kon row e zero aache
    // dummyColum is to track je kon kon col e zero aache

    // like if arr[0][0] has the value of 0, then we put
    // dummyRow[0] as 0
    // dummyCol[0] as 0

    static void traverseDummy(int[][] arr, int[] dummyRow, int[] dummyCol) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (dummyRow[i] == 0 || dummyCol[j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void OptimalMain() {
        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int[] dummyRow = new int[arr.length];
        int[] dummyCol = new int[arr[0].length];

        Arrays.fill(dummyRow, -1);
        Arrays.fill(dummyCol, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    dummyRow[i] = 0;
                    dummyCol[j] = 0;
                }
            }
        }

        traverseDummy(arr, dummyRow, dummyCol);

    }

}