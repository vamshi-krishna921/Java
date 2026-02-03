import java.util.Scanner;

public class FindRotations {
    static int search(int arr[]) {
        int min = Integer.MAX_VALUE;
        int rotated = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    rotated = low;
                    min = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] <= arr[high]) {
                    rotated = mid;
                    min = arr[mid];
                }
                high = mid - 1;
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is rotated for " + search(arr) + " times.");
    }
}
