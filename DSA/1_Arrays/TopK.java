//! QUESTION: https://leetcode.com/problems/top-k-frequent-elements/
//! Leetcode MEDIUM

//* Desc */
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

//* Brute force */
// Take each element, count freqs and maybe store them in an array
// Return K most top freqs.

//* Optimal */

import java.util.*;

public class TopK {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry entry : map.entrySet()) {
            pq.add(entry);
        }

        // System.out.println(topKFrequent(arr, k));
    }

}
