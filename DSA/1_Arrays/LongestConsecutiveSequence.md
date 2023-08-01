<!-- TOC -->

- [Details of the problem](#details-of-the-problem)
- [Brute Force Approach 🔨](#brute-force-approach-)
- [Optimal Approach 🤓](#optimal-approach-)
- [Java Code 👇](#java-code-)

<!-- /TOC -->


# Details of the problem

**Here is the question: https://leetcode.com/problems/longest-consecutive-sequence/** 
 
 
 
Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in `O(n)` time.

Input: `nums = [100,4,200,1,3,2]`
Output: `4`

The longest consecutive elements sequence is `[1, 2, 3, 4]`. Therefore its length is 4.

# Brute Force Approach 🔨

The brute force would be to go to each and every element and check if the next element is present in the array or not. If it is present then increment the count and if it is not present then check if the count is greater than the max or not. If it is greater then update the max.

It would have a time complexity of `O(n^2)` and space complexity of `O(1)`.

# Optimal Approach 🤓

Consider we have an array like : `[4, 200, 100, 99, 98, 1, 3, 2]`

We use a hashset, and put all the element in the array inside of the set first.

- Then we define two variables `total` and `max` and initialize them to 1 and 0 respectively. This is because the minimum length of the sequence would be 1 and the maximum would be 0 (max can be always updated so 0 doesnot matter). <br><br>
- So consider that we have an array that we defined the above and we are gonna be having to iterate through the whole array. <br><br>

 - once we have a particular number suppose in the very first case we are gonna be having 4 as `arr[i]`,  so we first check if 3 exists inside of our array or not.  <br><br>

 - we do this because if we have` 4,3,2 ` then it is pretty much obvious that the longest sequence can start from `2` so we can count it from `2` also. So it doesn't make any sense to count in a decremental order <br><br>

 - so in our case we will be coming up with `4` and we already have `3` inside of our array so we will go to the next value which is 200. <br><br>

 - no we do not have `200 - 1` that is 199 inside the array so it is pretty obvious that we are gonna be ending up with a sequence whose last number is `200` itself. <br><br>

 - So what happens next is we take ourselves a variable called element and put 201 inside of it so that we can keep checking.<br><br> 
 - Now you will ask why are we putting `201` inside of that element the reason is simple because if 200 is the last value of the sequence there is a chance that the sequence starts from 200 itself and goes like `201, 202. . . .` so we are putting the higher value to keep checking that's all <br><br>

 - now we will be starting a while loop and we will keep checking if the next element is inside of our set and we will keep incrementing the total.  in our case we do not have 201 inside of our array so we don't run that while loop we come out of that while loop. <br><br>

 - once we are outside of the while loop we increment the max value accordingly and set total as one because it is just 200 so that's the longest sequence as of now. <br><br>

 - next we come down to 100  but we have 99 inside of our at it so we skip 100.  then we go to 99 and then we go to 98.  <br><br>

 - now as soon as we are on 98 it is pretty obvious that we are starting our journey from 98 so we make our element as 99,  and we run a while loop so while loop will now check ok we have 98 we have 99 we have 100 we do not have 101,  so it will stop then it will update my macs as three and then it will go to the next element <br><br>




# Java Code 👇

```java

import java.util.*;

class LongestConsecutiveSequence {

    static void addAllElements(int[] arr, Set<Integer> hashset) {
        for (int i = 0; i < arr.length; i++) {
            hashset.add(arr[i]);
        }
    }

    static void calculateLongest(int[] arr, Set<Integer> hashset) {
        addAllElements(arr, hashset);
        int total = 1;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!hashset.contains(arr[i] - 1)) {
                int element = arr[i] + 1;
                while (hashset.contains(element)) {
                    total++;
                    element++;
                }
                if (total > max)
                    max = total;

                total = 1;
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        calculateLongest(arr, hashset);
    }
}


```