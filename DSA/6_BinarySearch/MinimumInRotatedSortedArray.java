// The question: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1061559686/
// So basically we need to find the pivot maybe

class MinimumSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                // i am in the left part of the array
                left = mid + 1;
            } else {
                // i am in the right part of the array
                right = mid;
            }
        }

        return nums[left];
    }
}