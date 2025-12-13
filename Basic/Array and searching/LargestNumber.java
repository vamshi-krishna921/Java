import java.util.Scanner;
import java.lang.Math;
public class LargestNumber {
    // function
    static int largestNumber(int arr[]) {
        // ? O(n^2) non - optimal soln
        // int largest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i+1; j < arr.length; j++) {
        // if (arr[i] < arr[j]) {
        // largest = arr[j];
        // }
        // }
        // }
        // return largest;

        // TODO O(n) Optimal soln
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            // if (largest < arr[i]) {
            //     largest = arr[i];
            // }
        }
        return largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numbers : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The largest number is : " + largestNumber(arr));
    }
}
