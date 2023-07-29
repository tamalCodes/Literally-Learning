// question: https://leetcode.com/problems/sliding-window-maximum/
// LEETCODE HARD

// naive approach would be to loop through all the sub arrays
// we go to all sub arrays of length 3 and calculate max
// N*K

// a much more optimized concept would be to 

import java.util.*;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n - k + 1]; // basically jotogulo window hobe
        int left, right = 0;

        Deque<Integer> q = new ArrayDeque<>();

        while (right < n) {

            // the goal is for a window i wanna have the max value / index of that value
            // inside the deque

            // so before adding a value, i just wanna make sure that i have got rid of
            // "smaller" ones

            while (!q.isEmpty() && q.peekLast() <= arr[right])
                q.pollLast();

            // once the smaller values are removed completely
            // we can now add the current value
            q.offer(arr[right]);

            // so that we have now added the current value we wanna make sure that we have
            // not reached the window size

            // if we have reached, it is time to get the max element that is present
            // at the head of the DeQueue, and then pop that out

        }

        return result;
    }

}
