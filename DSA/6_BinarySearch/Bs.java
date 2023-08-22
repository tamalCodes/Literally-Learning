
public class Bs {
    static void binarysearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            }

            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        System.out.println("Element was not found in the array, position would have been " + (++mid));

    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };
        binarysearch(arr, 2);
    }
}
