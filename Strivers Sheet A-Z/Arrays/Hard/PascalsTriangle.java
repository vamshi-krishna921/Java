import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle {

    // ? Factorial function
    static int fact(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res /= (i + 1);
        }
        return res;
    }

    // ? Print the elem at row and col
    // static void elemAtRowCol(int row, int col) {
    // int result = fact(row - 1, col - 1);
    // System.out.print("The elem at " + row + " " + col + " is " + result);
    // }

    // ? Row elems print
    // static void rowPrint(int row){
    // int result = 1;
    // System.out.print(result + " ");
    // for (int col = 1; col < row; col++) {
    // result = result * (row-col)/col;
    // System.out.print(result + " ");
    // }
    // }

    // ? Printing pascals triangle
    static ArrayList<ArrayList<Integer>> printTriangle(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // ! Brute force using the ncr
        // for (int i = 0; i < n; i++) {
        // ArrayList<Integer> temp = new ArrayList<>();
        // for (int j = 0; j <= i; j++) {
        // temp.add(fact(i, j));
        // }
        // result.add(temp);
        // }
        // * Optimized solution using the 2nd formula
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int ans = 1;
            temp.add(ans);
            for (int j = 1; j <= i; j++) {
                ans = ans * (i - j + 1) / j;
                temp.add(ans);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ? Print the elem at row and col
        System.out.print("Enter the row : ");
        int row = sc.nextInt();
        // System.out.print("Enter the col : ");
        // int col = sc.nextInt();
        // elemAtRowCol(row, col);
        // rowPrint(row);
        ArrayList<ArrayList<Integer>> triangle = printTriangle(row);
        for (ArrayList<Integer> list : triangle) {
            for (int elem : list) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
