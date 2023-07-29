import java.util.*;

public class TrappingRainwater {

    static void runBrute(int[] arr) {
        int[] maxLeft = new int[arr.length];
        int[] maxRight = new int[arr.length];

        // calculate the maxLeft values

        int max = 0;
        for (int i = 0; i < maxLeft.length; i++) {
            if (i == 0) {
                maxLeft[0] = 0;
                max = arr[i];
            } else {
                maxLeft[i] = max;
                if (arr[i] > max)
                    max = arr[i];
            }

        }

        max = 0;

        // calculate the maxRight values
        for (int i = maxRight.length - 1; i >= 0; i--) {
            if (i == maxRight.length - 1) {
                maxRight[maxRight.length - 1] = 0;
                max = arr[i];
            } else {
                maxRight[i] = max;
                if (arr[i] > max)
                    max = arr[i];
            }

        }

        // finally calculate the water for each block
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Math.min(maxLeft[i], maxRight[i]) - arr[i] >= 0)
                sum += Math.min(maxLeft[i], maxRight[i]) - arr[i];
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        runBrute(arr);
    }
}