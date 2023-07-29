import java.util.Scanner;

public class SelectionSort {

    static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[maxIndex] < arr[i])
                maxIndex = i;
        }

        // returning the index of the largest value in the array.
        return maxIndex;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void useSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int maxIndex = getMaxIndex(arr, 0, arr.length - i - 1);
            swap(arr, maxIndex, arr.length - 1 - i);

            System.out.println("After pass " + i + " the array is : ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }

        System.out.println("The sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 5, 4, 3, 2, 1 };
        useSelectionSort(arr);
    }
}
