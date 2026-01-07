import java.util.Scanner;

public class Spiralmatrix {
    static void spiralMat(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1, startCol = 0, endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
           if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j]);
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size of matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the col size of matrix: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.print("Enter the " + row * col + " elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralMat(matrix);
    }
}
