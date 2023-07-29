import java.util.*;

public class ContainerwithMostWater {

    static void runBrute(int[] arr) {

        int maxArea = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int area = (j - i) * Math.min(arr[i], arr[j]);
                if (area > maxArea)
                    maxArea = area;
            }
        }

        System.out.println(maxArea);
    }

    static void runOptimal(int[] arr) {
        int maxArea = 0;
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int area = Math.abs(right - left) * Math.min(arr[right], arr[left]);
            if (area > maxArea)
                maxArea = area;

            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        runBrute(arr);
        runOptimal(arr);
    }
}
