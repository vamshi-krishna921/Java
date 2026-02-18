import java.util.Scanner;

public class AllocateBooks {

    static int[] FindMaxSum(int arr[]) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i : arr) {
            max = Math.max(max, i);
            sum += i;
        }
        return new int[] { max, sum };
    }

    static boolean isAllocated(int[] arr, int mid, int k) {
        int s = 1, pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] > mid) {
                pages = arr[i];
                s++;
                if (s > k) {
                    return false;
                }
            } else {
                pages += arr[i];
            }
        }
        return true;
    }

    static int search(int[] arr, int k) {
        if (k > arr.length)
            return -1;
        int[] maxSum = FindMaxSum(arr);
        int low = maxSum[0], high = maxSum[1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isAllocated(arr, mid, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the books: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no of students: ");
        int k = sc.nextInt();
        System.out.print("The result is " + search(arr, k));
    }
}
