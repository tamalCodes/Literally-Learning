import java.util.*;

public class BesttimetoBuyAndSell2 {
    static void buySell(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                profit += (arr[i] - arr[i - 1]);
        }

        System.out.println(profit);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        buySell(arr);
    }
}