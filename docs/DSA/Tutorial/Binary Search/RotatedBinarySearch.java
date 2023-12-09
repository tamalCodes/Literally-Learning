import java.util.Scanner;

public class RotatedBinarySearch {

    public static int findPivot(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[mid] < arr[start])
                end = mid - 1;

            if (arr[mid] > arr[start])
                start = mid + 1;

        }

        return -1;
    }

    public static void findInArray(int[] arr, int pivotIndex, int target) {

        int start = 0, end = pivotIndex;

        if (target < arr[0]) {
            start = pivotIndex + 1;
            end = arr.length - 1;
        }

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Target " + target + " found at : " + mid);
                return;
            }

            if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        System.out.println("Target not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 7, 8, 9, 10, 1, 2, 3, 4, 5, 6 };
        int pivotIndex = findPivot(arr);

        findInArray(arr, pivotIndex, 5);

    }
}
