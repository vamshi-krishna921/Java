import java.util.Scanner;

public class FloorAndCeil {
    static int[] floorCeil(int arr[], int target) {
        int result[] = new int[2];
        result[0] = floor(arr, target);
        result[1] = ceil(arr, target);
        return result;
    }

    static int floor(int arr[], int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int ceil(int arr[], int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
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
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int result[] = floorCeil(arr, target);
        System.out.print("The floor : " + result[0] + " the ceil : " + result[1]);
    }
}
