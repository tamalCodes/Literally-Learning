import java.util.*;;

public class Optimal {

    static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void transpose(int[][] arr) {

        // making the cols row

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                swap(arr, i, j);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        transpose(arr);
    }

}
