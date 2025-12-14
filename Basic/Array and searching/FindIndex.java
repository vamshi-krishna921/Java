import java.util.Scanner;

public class FindIndex {
    // Sorted array only
    static int findIndex(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
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
        System.out.print("Enter the key element : ");
        int key = sc.nextInt();
        System.out.print("The key is at index : " + findIndex(arr, key));
    }
}
