import java.util.HashMap;
import java.util.Scanner;

public class XORSubArray {

    static int longestSubarrayXORofK(int[] arr, int k) {
        int count = 0;

        // ! Brute force (Generate the subarray's and do XOR)
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // int xor = 0;
        // for (int l = i; l <= j; l++) {
        // xor ^= arr[l];
        // }
        // if (xor == k) {
        // count++;
        // }
        // }
        // }

        // * Better soln using only 2 loops
        // for (int i = 0; i < arr.length; i++) {
        // int xor = 0;
        // for (int j = i; j < arr.length; j++) {
        // xor = xor^arr[j];
        // if (xor==k) {
        // count++;
        // }
        // }
        // }

        // TODO Optimal soln using hashmap (For finding the max length we use math, but
        //TODO we need to get the count of k so we used only the index value)
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }
            map.put(xor, map.getOrDefault(xor, i) + 1);
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elems : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int k = sc.nextInt();
        int result = longestSubarrayXORofK(arr, k);
        System.out.println(result);
    }
}
