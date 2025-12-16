import java.util.Arrays;
import java.util.Scanner;

public class FindMissingInArray {
    static int FindMissing(int[] arr) {

        // * Using loop and sorting it is O(nlogn) time complexity */
        // Arrays.sort(arr);
        // int missing = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != missing) {
        // break;
        // }
        // missing++;
        // }
        // return missing;

        // * Using sum with O(n) time complexity array starts with 1
        // int sum = 0;
        // int n = arr.length + 1;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // int formula = (n * (n + 1)) / 2;
        // return formula - sum;

        // * Using sum but starts with any number */
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int expectedSum = (max - min + 1) * ( min + max) / 2;
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = FindMissing(arr);
        System.out.println("The missing number is " + result);

    }
}
