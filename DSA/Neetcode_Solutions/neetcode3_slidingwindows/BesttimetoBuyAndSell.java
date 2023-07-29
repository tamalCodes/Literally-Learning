//! https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//! EASY

//^ DESC
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//^ EXAMPLE
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

// The brute force approach would be to select one element and then calculate the profit for all the other remaining elements from i+1
// Keep storing and checking for the same.

// The optimal easy approach was to have 2 pointers.
// One at start, one at second element.
// Calculate profit, if none, then increase the left and right pointer in hopes of getting a totally new Buying and selling price
// If there is profit, we increase the right pointer in order to get more profit...

import java.util.*;

public class BesttimetoBuyAndSell {

    static void runOptimal(int[] arr) {
        int left = 0, right = left + 1, i = 0;
        int maxProfit = 0, profit = 0;

        while (i < arr.length - 1) {
            profit = arr[right] - arr[left];

            if (profit > maxProfit)
                maxProfit = profit;

            if (arr[right] > arr[left]) {
                right++; // because there might be a chance of having more profit to the right
            } else {
                left++; // else totally new set of buying and selling price
                right++;
            }
            i++;
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };

        runOptimal(arr);
    }
}