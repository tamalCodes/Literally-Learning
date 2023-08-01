<!-- TOC -->

- [Details of the problem](#details-of-the-problem)
- [Example](#example)
- [Approach 🐹](#approach-)
- [Java Code 👇](#java-code-)

<!-- /TOC -->


# Details of the problem

**Here's the link: https://leetcode.com/problems/rearrange-array-elements-by-sign/**

You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

 - Every consecutive pair of integers have opposite signs.
 - For all integers with the same sign, the order in which they were present in nums is preserved.
 - The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

# Example 

Input: `nums = [3,1,-2,-5,2,-4]`
Output: `[3,-2,1,-5,2,-4]`

Explanation:
The positive integers in nums are `[3,1,2]`. The negative integers are `[-2,-5,-4]`.
The only possible way to rearrange them such that they satisfy all conditions is `[3,-2,1,-5,2,-4]`.
Other ways such as `[1,-2,2,-5,3,-4]`, `[3,1,2,-2,-5,-4]`, `[-2,3,-5,1,-4,2]` are incorrect because they do not satisfy one or more conditions. 

# Approach 🐹

- We first define a new array called `alternateArray`, the goal is to put the positive and negatives number in here.
- Then we traverse through `arr` and go to each and every element and check if it is positive or negative.
- We also maintain 2 different indexes, one for positive and one for negative.
- If element is positive then we put it in the `alternateArray` at the positive index and increment the positive index by 2.
- If element is negative then we put it in the `alternateArray` at the negative index and increment the negative index by 2.
- Why is the negativeIndex starting from 1? Because we want the first element to be positive.

# Java Code 👇

```java
public class ReArrangeElements {
    static void work(int[] arr) {

        int postiveIndex = 0;
        int negativeIndex = 1;

        int[] alternateArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                alternateArray[postiveIndex] = arr[i];
                postiveIndex += 2;
            } else {
                alternateArray[negativeIndex] = arr[i];
                negativeIndex += 2;
            }
        }

        System.out.println("Alternate Array: ");
        for (int i = 0; i < alternateArray.length; i++) {
            System.out.print(alternateArray[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        work(arr);
    }
}
```