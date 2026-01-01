import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraySumk {
    static int LongSubArraySum(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum - k)) {
                // int curLen = i - map.get(sum - k);
                // maxLen = Math.max(maxLen, curLen);
                maxLen = Math.max(maxLen, i - map.get(sum-k));
            }
            map.putIfAbsent(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k value : ");
        int k = sc.nextInt();
        System.out.print("The second largest is " + LongSubArraySum(arr, k));
        sc.close();
    }
}
