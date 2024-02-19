import java.util.*;

public class ReplaceElementsWithTheGreatesonTheRightSide {

    static void runBrute(int[] arr) {
        int[] result = new int[arr.length];
        int greatestOnright = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++)
                greatestOnright = Math.max(greatestOnright, arr[j]);

            result[i] = greatestOnright;
            greatestOnright = 0;
        }

        result[arr.length - 1] = -1;
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static void runOptimal(int[] arr) {
        // here the intuition is to go through the array in reverse order
        // why do we do that ? because we want to keep track of the greatest element on
        // the right side of the array so far
        // and we want to replace the current element with the greatest element on the
        // right side of the array

        // so we start from the end of the array and keep track of the greatest element

        int greatestElement = -1, newMax = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newMax = Math.max(greatestElement, arr[i]);
            arr[i] = greatestElement;
            greatestElement = newMax;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };

        runOptimal(arr);
    }
}
