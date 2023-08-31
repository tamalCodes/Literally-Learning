//Question: https://leetcode.com/problems/frequency-of-the-most-frequent-element/

// Approach: 

// we first of all sort the array
// then a simple sliding window approach to go through a window and check the max element
// how we ensure the window is valid is mentioned later in the code

// while invalid we do left++
// we also keep track of the maxLength

import java.util.Arrays;

class FrequencyOfTheMostFrequent {
    public static int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);

        int left = 0, right = 0, maxLength = 0;
        long sum = 0;

        while (right < arr.length) {
            sum += arr[right];

            // arr[right] * window's length < sum + k
            // why are we doing this ?

            // see basically if we have k = 2, and window as [1,1,1,2]
            // i can spend the K(s) to update two 1(s)
            // so realistically what should be the max value of the window ?
            // [1,2,2,2] = 7

            // therefore we check the total length [1,1,1,2] which is 8
            // but can we update ALL the 1(s) here?

            // no
            // that is the reason why we do arr[right] * window's length
            // it will give me 8, but IK my max capacity is 7

            while (arr[right] * (right - left + 1) > sum + k) {
                sum -= arr[left];
                left += 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 4 };
        int k = 2;

        System.out.println(maxFrequency(arr, k));
    }
}