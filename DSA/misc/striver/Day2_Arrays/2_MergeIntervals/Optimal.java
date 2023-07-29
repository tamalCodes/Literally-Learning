//! QUESTION : https://leetcode.com/problems/merge-intervals/
//! LEETCODE MEDIUM

//* Description -> Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

//& Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//& Output: [[1,6],[8,10],[15,18]]
//& Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

//^ first we add the first interval to the merged list 👉 int[] current_interval = intervals[0]; merged.add(current_interval);
//^ Here, current_interval is an array in itself
//^ notice that then we start the for loop, the value of current_interval has not changed. So whatever changes we do the value of the current interval, it will be refelected in the merged list.

//^ We then come to [2,6]
//^ so after a while [1,3] becomes [1,6] as 2<3
//^ Current list 👉 [{1,6}]

//^ so if we go to [8,10] , it is not possible to merge. So we add it to the merged list. 

//^ Current list 👉 [{1,6} {8,10}]

//^ so now we go to [15,18] , it is not possible to merge with [8,10] because 15 > 10. So we add it to the merged list.
//^ Current list 👉 [{1,6} {8,10} {15,18}]

//^ time complexity (we are not sorting the array): O(n)
//^ space complexity : O(n)

import java.util.*;

public class Optimal {

    static void printResult(List<int[]> result) {
        // Printing the result
        for (int[] array : result) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i != array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    static void merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        result.add(current); // first val ta (1,3) ke add koredilam

        for (int[] interval : intervals) {

            // For 1,3 and 2,6 i need to make sure C[1]>=I[0]
            // Here 3 is >= to 2
            // So we just update the current which is present in result to 1,6
            if (current[1] >= interval[0]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                result.add(current);
            }
        }

        printResult(result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        merge(arr);

    }
}