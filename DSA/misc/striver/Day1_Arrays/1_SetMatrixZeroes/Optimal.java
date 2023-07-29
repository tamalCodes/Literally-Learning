import java.util.*;

public class Optimal {

    static void setRowColumnZeroes(int[][] matrix) {
        boolean isFirstRowHasZeros = false, isFirstColumnHasZeros = false;
        int rows = matrix.length, columns = matrix[0].length;

        // * Checking if the first col has 0 */
        // * If they do, then the first col full will be 0 */
        for (int i = 0; i < columns; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowHasZeros = true;
                break;
            }
        }

        // * Checking if the first row has 0 */
        // * If they do, then the first row full will be 0 */
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                isFirstColumnHasZeros = true;
                break;
            }
        }

        // * Notice that we are starting from 1,1 skipping the 1st row, col */
        // * We will use 1st row, col as dummy array to set them to 0 */

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        // * Check in 1st row. If any one in that first row has 0 , then oi element tar
        // * niche all the elements will be 0 */

        // * Imagine 3X3 array. I found [0][3]==0 */
        // * Then [1][3],[2][3],[3][3], will be zeroes too */

        for (int i = 1; i < columns; i++) {
            if (matrix[0][i] == 0) {
                for (int row = 1; row < rows; row++) {
                    matrix[row][i] = 0;
                }
            }
        }

        // * Same for cols */

        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                int column = 1;
                while (column < columns) {
                    matrix[i][column] = 0;
                    column++;
                }
            }
        }

        // * Finally we are checking the first row and col , aager oita true pele, full
        // * first row, col ke 0 banabo */

        if (isFirstRowHasZeros) {
            for (int i = 0; i < columns; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isFirstColumnHasZeros) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String args[]) {
        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setRowColumnZeroes(arr);

        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
