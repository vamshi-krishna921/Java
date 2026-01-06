import java.util.Scanner;

public class rotateMatrix {
    static void rotateMat(int[][] arr,int row, int col){
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][arr.length - i - 1] = arr[i][j];
            }
        }
        for (int[] values : result) {
            for (int value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
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
        rotateMat(arr,row,col);
    }
}
