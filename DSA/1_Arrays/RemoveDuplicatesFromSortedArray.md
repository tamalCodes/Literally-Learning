<!-- TOC -->

- [Explanation 👻](#explanation-)
- [Example](#example)
- [Approach 🐹](#approach-)
- [Java Code 👇](#java-code-)

<!-- /TOC -->

# Explanation 👻

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.


Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.

Return the number of uniue elements too !

# Example 

Input: `nums = [0,0,1,1,1,2,2,3,3,4]`
Output: `5, nums = [0,1,2,3,4,_,_,_,_,_]`

Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

# Approach 🐹

- We maintain an index called `inplacePointer` which points to the index where we can place the unique element. We do this to implement the `in-place` requirement of the question.
- We then next iterate over the array and check if the current element is equal to the previous element.
- If it is not, we place the previous element at the `inplacePointer` index and increment the `inplacePointer` index.

```
For example 
We are at                👇🏻(this 1)
Suppose our arr =   `[0,0,1,1,1,2,2,3,3,3]`
```
- Then our `arr[i]=1` and `arr[i-1]=0` and `inplacePointer=0`. 
Since `arr[i]!=arr[i-1]` we place `arr[i-1]` at `arr[inplacePointer]` 
- And increment `inplacePointer` by 1.

- The inplacePointer will point to the index where we can place the next unique element.
- At the end we do ` arr[inplacePointer++] = arr[arr.length - 1];` this is because the last element is always unique and we need to place it at the `inplacePointer` index.
- Do a dry run to understand this better.


# Java Code 👇

```java
public class RemoveDuplicatesFromSortedArray {

    static void remove(int[] arr) {
        int inplacePointer = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[inplacePointer] = arr[i - 1];
                inplacePointer++;
            }
        }
        arr[inplacePointer++] = arr[arr.length - 1];

        System.out.println("Unique elements: " + inplacePointer);

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 3 };
        remove(arr);
    }
}
```