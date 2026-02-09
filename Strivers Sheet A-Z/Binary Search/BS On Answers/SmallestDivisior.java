import java.util.Scanner;

public class SmallestDivisior {
    static int search(int arr[], int t) {
        // ! Brute
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        // for (int i = 1; i <= max; i++) {
        // int sum = 0;
        // for (int j = 0; j < arr.length; j++) {
        // sum += Math.ceil((double) arr[j] / i);
        // }
        // if (sum <= t) {
        // return i;
        // }
        // }
        int ans = -1;
        // TODO Optimal
        int low = 1, high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += Math.ceil((double) arr[j] / mid); // sum += (arr[j] + mid -1) / mid;
            }
            if (sum <= t) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
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
        System.out.print("Enter the threshold: ");
        int t = sc.nextInt();
        System.out.print("The result is " + search(arr, t));
    }
}
