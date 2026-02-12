import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

    static boolean cowsSettle(int[] arr, int dist, int k) {
        int count = 1, cowLast = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - cowLast) >= dist) {
                cowLast = arr[i];
                count++;
            }
            if (count >= k) {
                return true;
            }
        }
        return false;
    }

    static int[] findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int elem : arr) {
            min = Math.min(min, elem);
            max = Math.max(max, elem);
        }
        return new int[] { min, max };
    }

    static int search(int arr[], int k) {
        Arrays.sort(arr);
        int minMax[] = findMinMax(arr);
        int ans = 0;
        // ! Brute
        // for (int i = 1; i <= minMax[1] - minMax[0]; i++) {
        // if (cowsSettle(arr, i, k)) {
        // ans = i;
        // continue;
        // } else {
        // return ans;
        // }
        // }
        // return ans;

        // TODO Optimal
        int low = 1, high = minMax[1] - minMax[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (cowsSettle(arr, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no. of cows: ");
        int k = sc.nextInt();
        System.out.print("The result is " + search(arr, k));
    }
}
