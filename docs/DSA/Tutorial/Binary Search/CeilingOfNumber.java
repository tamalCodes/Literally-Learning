import java.util.Scanner;

public class CeilingOfNumber {

    public static void ceilingNumber(int[] arr, int n) {
        int start = 0, end = arr.length - 1;

        if (arr[end] == n) {
            System.out.println("Ceiling can't be found for the last number in the array");
            return;
        }

        // good old binary search

        while (start <= end) {

            int mid = (start + end) / 2;
            System.out.println(mid);

            if (arr[mid] == n) {
                System.out.println("Ceiling is " + arr[mid + 1]);
                return;
            } else if (arr[mid] > n)
                end = mid - 1;
            else
                start = mid + 1;

        }

        System.out.println("Ceiling is " + arr[start]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 2, 3, 5, 9, 14, 16, 18, 21, 28 };
        ceilingNumber(arr, 10);
    }
}
