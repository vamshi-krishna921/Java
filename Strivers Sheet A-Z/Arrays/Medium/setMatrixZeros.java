import java.util.Scanner;

public class setMatrixZeros {
    // ! Brute force
    // static void rowChangeZeros(int i, int[][] arr) {
    // for (int j = 0; j < arr.length; j++) {
    // arr[i][j] = -1;
    // }
    // return;
    // }

    // static void colChangeZeros(int j, int[][] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // arr[i][j] = -1;
    // }
    // return;
    // }

    // static void setToZeros(int[][] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[i][j] == -1) {
    // arr[i][j] = 0;
    // }
    // }
    // }
    // return;
    // }

    // * Better soln achieved by marking rows and cols
    static void setToZeros(int[][] arr, boolean[] markRow, boolean[] markCol) {
        for (int i = 0; i < markRow.length; i++) {
            for (int j = 0; j < markCol.length; j++) {
                if (markRow[i] || markCol[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size of array: ");
        int row = sc.nextInt();
        System.out.print("Enter the col size of array: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.print("Enter the " + row * col + " elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // ! Brute force
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[i][j] == 0) {
        // rowChangeZeros(i, arr);
        // colChangeZeros(j, arr);
        // }
        // }
        // }
        // setToZeros(arr);

        // * Optimal soln by marking rows and cols
        boolean markRow[] = new boolean[row];
        boolean markCol[] = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    markRow[i] = true;
                    markCol[j] = true;
                }
            }
        }
        setToZeros(arr, markRow, markCol);

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
    }
}
