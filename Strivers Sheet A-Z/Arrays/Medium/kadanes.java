import java.util.Scanner;

public class kadanes {
    static int maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            max = Math.max(max, sum);
            end = i;
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        return max;
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
       System.out.print("The max sub array sum : " +  maxSubarraySum(arr));
    }
}
