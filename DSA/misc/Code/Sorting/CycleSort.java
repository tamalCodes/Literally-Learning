import java.util.*;

public class CycleSort {

    static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printmyArray(int[] arr) {

        int i = 0;
        System.out.println("The sorted array is : ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void useCyclicsort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int j = arr[i] - 1;
                swap(arr, i, j);

            } else {
                i++;
            }
        }

        printmyArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 5, 1, 3, 2, 4 };
        useCyclicsort(arr);
    }
}
