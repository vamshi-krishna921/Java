import java.util.Scanner;

public class userInput {
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
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

}
