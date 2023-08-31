//! Question: https://leetcode.com/problems/fruit-into-baskets/submissions/
//! Leetcode Medium

// Basically the target is to find the longest subarray where there are only 2 types of numbers
// Therefore we are using a greedy sliding window approach 

// we keep going to right side and as soon as we have a invalid subarray where the elements are 
// more than of 2 types we then start the while loop where we increase the left
// thaw way we follow a greedy approach

import java.util.HashMap;

class FruitsIntoBasket {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int totalCount = 0, maxCount = 0;

        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            totalCount += 1;

            while (map.size() > 2) {
                System.out.println("The map size is: " + map.size());
                System.out.println("The left is: " + left);

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) <= 0)
                    map.remove(fruits[left]);

                left++;
                totalCount -= 1;
            }

            if (totalCount < 0)
                totalCount = 0;

            maxCount = Math.max(totalCount, maxCount);
            right++;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2 };
        System.out.println(totalFruit(arr));
    }
}
