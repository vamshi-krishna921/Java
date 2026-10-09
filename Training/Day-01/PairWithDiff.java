import java.util.Arrays;

public class PairWithDiff {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 4, 2 };
        int target = 2;
        boolean found = false;
        int left = 0;
        int right = 1;
        Arrays.sort(arr);
        while (right < arr.length) {
            int diff = arr[right] - arr[left];
            if (left != right && diff == target) {
                found = true;
                System.out.println("True");
                return;
            } else if (diff < target) {
                right++;
            } else {
                left++;
            }
        }
        if (found) {
            System.out.println("false");
        }
    }
}
