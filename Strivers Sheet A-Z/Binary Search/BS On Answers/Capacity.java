import java.util.Scanner;

public class Capacity {

    static int[] maxElem(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : arr) {
            max = Math.max(max, i);
            sum += i;
        }
        return new int[] { max, sum };
    }

    static int RequiredDays(int[] weights, int cap) {
        int sum = 0;
        int days = 1;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > cap) {
                days++;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }
        return days;
    }

    static int search(int weights[], int days) {
        int max[] = maxElem(weights);
        // ! Brute force
        // for (int i = max[0]; i < max[1]; i++) {
        // int Reqdays = RequiredDays(weights, i);
        // if (Reqdays <= days) {
        // return i;
        // }
        // }

        // TODO Optimal
        int low = max[0], high = max[1];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int Reqdays = RequiredDays(weights, mid);
            if (Reqdays <= days) {
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
        System.out.print("Enter the size of weights:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the weights: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the days to shifts: ");
        int days = sc.nextInt();
        System.out.print("The result is " + search(arr, days));
    }
}
