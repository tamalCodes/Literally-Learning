public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = { -1, -1 };

        int left = 0, right = nums.length - 1;
        int mid = 0, index = 0;

        // finding the leftmost element
        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
            else {
                arr[0] = mid;
                right = mid - 1;
            }
        }

        // finding the rightmost element
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
            else {
                arr[1] = mid;
                left = mid + 1;
            }
        }

        return arr;
    }
}
