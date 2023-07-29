import java.util.*;

public class Brute {

    // 3 bar iterate korchi array teh amra.
    // 1 --> setmatrixzero
    // 2 --> transformRows+transformCols
    // 3 --> transformNegatives

    static void transformRows(int[][] arr, int row) {
        for (int j = 0; j < arr[row].length; j++) {
            if (arr[row][j] != 0)
                arr[row][j] = -999999;
        }

    }

    static void transformCols(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != 0)
                arr[i][col] = -999999;

        }

    }

    static void transformNegatives(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -999999)
                    arr[i][j] = 0;
            }
        }
    }

    static void setmatrixzero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = -999999;
                    transformRows(arr, i);
                    transformCols(arr, j);
                }
            }
        }

        transformNegatives(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 },
        };

        setmatrixzero(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println("");
        }

    }

}
