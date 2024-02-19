import java.util.Scanner;

public class FirstandLastOccurance {

    public static int findfirstandlastocc(int[] arr, int n, boolean isleft) {

        int start = 0, end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > n)
                end = mid - 1;
            else if (arr[mid] < n)
                start = mid + 1;
            else {
                index = mid;
                if (isleft)
                    end = mid - 1;
                else
                    start = mid + 1;

            }
        }

        return index;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 8, 9, 10, 10, 10, 11 };

        int[] ans = new int[2];

        ans[1] = findfirstandlastocc(arr, 5, false);
        ans[0] = findfirstandlastocc(arr, 5, true);

        System.out.println("Start is : " + ans[0] + " and End is : " + ans[1]);

    }
}
