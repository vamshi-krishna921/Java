import java.util.Scanner;

public class upperBound {

    static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = arr.length; // Hypothetical answer
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
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
        System.out.print("The upper bound found at index : " + search(arr, target));
    }
}
