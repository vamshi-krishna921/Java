import java.util.Scanner;

public class firstLastOccurance {
    static int[] firstLast(int[] nums, int target) {
        // ! brute using O(n) looping each elem
        // int first = -1, last = -1;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == target) {
        // if (first == -1) {
        // first = i;
        // last = i;
        // } else {
        // last = i;
        // }
        // }
        // }
        // return new int[] { first, last };
        // TODO Optimal soln using O(log2n) * O(log2n)
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);
        return new int[] { first, last };
    }

    static int firstOccurance(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    static int lastOccurance(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
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
        int[] result = firstLast(arr, target);
        System.out.print("The first and last occurance is [" + result[0] + "," + result[1] + "]");
    }
}
