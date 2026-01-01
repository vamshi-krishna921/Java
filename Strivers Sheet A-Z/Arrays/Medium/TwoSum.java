import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    static int[] sumtwo(int arr[], int target) {
        // ! Brute approach
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i+1; j < arr.length; j++) {
        // if (arr[i]+arr[j] == target) {
        // return new int[] {i,j};
        // }
        // }
        // }

        // * Better (prefix sum)
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // int curSum = target - arr[i];
        // if (map.containsKey(curSum)) {
        // return new int[] {map.get(curSum),i};
        // }
        // map.putIfAbsent(arr[i],i);
        // }

        // TODO Optimal soln (Two pointer)
        int j = arr.length - 1;
        int i = 0;
        int sum = 0;
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum == target) {
                return new int[] { i, j };
            }
            if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[] { -1, -1 };
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
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int[] result = sumtwo(arr, target);
        System.out.print(result[0] + " " + result[1]);
    }
}
