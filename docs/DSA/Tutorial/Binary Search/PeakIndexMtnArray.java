import java.util.Scanner;

public class PeakIndexMtnArray {

    public static boolean binarySearch(int[] arr, int start, int end, int target) {

        int mid = 0, start2 = end, end2 = arr.length - 1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Element " + target + " is found at : " + mid);
                return true;
            }

            if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;

        }

        while (start2 <= end2) {
            mid = (start2 + end2) / 2;
            if (arr[mid] == target) {
                System.out.println("Element " + target + " is found at : " + mid);
                return true;
            }

            if (arr[mid] < target)
                end2 = mid - 1;
            else
                start2 = mid + 1;

        }

        System.out.println("Element not found");
        return false;
    }

    public static void findPeak(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;

        while (start < end) {

            mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) // right side of peak
                end = mid;
            else
                start = mid + 1; // left side of the peak

        }

        System.out.println("The Peak element of this array is " + arr[start]);

        binarySearch(arr, 0, start, target);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 0, 2, 3, 4, 5, 7, 8, 9, 10, 6, 5, 3, 1 };

        findPeak(arr, 8);
    }

}