import java.util.Scanner;

public class KokoEatingBananas {
    static int maxElem(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static int findTime(int arr[], int i) {
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            int time = arr[j] / i;
            if (arr[j] % i != 0) {
                ans += time + 1;
            } else {
                ans += time;
            }
        }
        return ans;
    }

    static int search(int[] arr, int h) {
        // * Brute O(n)
        // int max = maxElem(arr);
        // for (int i = 1; i <= max; i++) {
        // int time = findTime(arr,i);
        // if (time<=h) {
        // return i;
        // }
        // }

        // TODO Binary search O(log)
        int max = maxElem(arr);
        int low = 1, high = max;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int time = findTime(arr, mid);
            if (time <= h) {
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
        System.out.print("Enter the size of piles[rooms]:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the hours: ");
        int h = sc.nextInt();
        System.out.print("The result is " + search(arr, h));
    }
}
