import java.util.Scanner;

public class BubbleSort {

    public static void useBubbleSort(int[] arr) {

        // * bubble sort explanation
        // * Intuition
        // after the first iteration, the largest element is last
        // after the second iteration,the 2nd largest element is at 2nd last

        // the outer loop is used to iterate over the array
        // the inner loop is used to compare the adjacent elements
        // if the adjacent elements are not in the correct order, then swap them
        // the inner loop runs for n - i - 1 times, where n is the length of the array,
        // and i is the outer loop counter
        // we do this for n-i-1 times because the last i elements are already in the
        // correct order

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("After pass " + i + " the array is : ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
        System.out.println("The final sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[] { 5, 4, 3, 2, 1 };
        useBubbleSort(arr);

    }

}
