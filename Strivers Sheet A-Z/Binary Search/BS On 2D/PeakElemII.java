import java.util.Scanner;

public class PeakElemII {
    static int[] searchPeak(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }
            int left = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int right = mid + 1 < n ? mat[maxRow][mid + 1] : -1;
            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[] { maxRow, mid };
            } else if (left > mat[maxRow][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of cols: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int result[] = searchPeak(matrix);
        System.out.print("The peak elem found at index: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
