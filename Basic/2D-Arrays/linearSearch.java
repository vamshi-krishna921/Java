import java.util.Scanner;

public class linearSearch {
    static void linearSear(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j]) {
                    System.out.print("The elem is found at [ " + i + ", " + j + " ]");
                }
            }
        }
        System.out.print("The elem is not exist in the matrix.");
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
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        linearSear(arr, key);
    }
}
