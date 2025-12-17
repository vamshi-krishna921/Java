import java.util.Scanner;

public class MaxPairSum {
    static int maxPairSum(int []arr){
        int maxNum = arr[0];
        int maxSum = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum = maxNum + arr[i];
            maxSum = Math.max(maxSum, tempSum);
            maxNum = Math.max(maxNum, arr[i]);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum pair sum is : " + maxPairSum(arr));
    }
}
