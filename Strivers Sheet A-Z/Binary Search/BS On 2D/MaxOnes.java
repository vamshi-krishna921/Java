import java.util.Scanner;

public class MaxOnes {

    static int findMax(int[] matrix, int rows){
        int low = 0, high = matrix.length-1;
        int ans = matrix.length;
        while (low<=high) {
            int mid = low + (high - low)/2;
            if (matrix[mid] == 1) {
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int findOnes(int[][] matrix, int rows, int cols) {
        int maxCount = 0, index = -1;

        // ! Brute
        // for (int i = 0; i < rows; i++) {
        // int count = 0;
        // for (int j = 0; j < cols; j++) {
        // if (matrix[i][j] == 1) {
        // count++;
        // }
        // }
        // if (count>maxCount) {
        // maxCount = count;
        // index = i;
        // }
        // }

        // TODO Optimal
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            ans = rows - findMax(matrix[i], rows);
            if (ans > maxCount) {
                maxCount = ans;
                index = i + 1;
            }
        }
        return index;
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
        System.out.print("The max 1's in the index is " + findOnes(matrix, rows, cols));
    }
}
