import java.util.Scanner;

public class diagonalSum {
    static void diaSum(int[][] mat,int n){
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i!=n-i-1) {
                sum += mat[i][n-i-1];
            }
        }
        System.out.print("The diagonal sum is " + sum);
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
       diaSum(arr, arr.length);
    }
}
