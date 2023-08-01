import java.util.*;

public class InsertionSort {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void useInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j = j - 1;
            }

            System.out.println("After pass " + i + " the array is : ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
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

        useInsertionSort(arr);

    }
}
