import java.util.Scanner;

public class spiralMatrix {
    static void spiralPrint(int[][] arr) {
        int startRow = 0, startCol = 0, endRow = arr.length - 1, endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // * top, the row is fixed, col(j) changes
            for (int j = 0; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // * right, the col is fixed, row changes(i)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // * bottom, the row is fixed, col changes(j)
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }
            // * left, the col is fixed, row changes(i)
            for (int i = endRow - 1; i > startRow+1; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of cols : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.print("Enter the matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralPrint(arr);
    }
}
