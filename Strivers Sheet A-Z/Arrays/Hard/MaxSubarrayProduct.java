import java.util.Scanner;

public class MaxSubarrayProduct {

    static int maxProduct(int[] arr) {
        // ! Brute using the i j k loops where k is the loop b/w the subarray calc
        // * Better using 2 loops
        // int max = 0;
        // for (int i = 0; i < arr.length; i++) {
        // int product = arr[i];
        // for (int j = i + 1; j < arr.length; j++) {
        // product *= arr[j];
        // max = Math.max(max, product);
        // }
        // }

        // TODO Optimal
        int n = arr.length;
        int maxProd = arr[0];
        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            prefix = (prefix == 0 ? 1 : prefix) * arr[i];
            suffix = (suffix == 0 ? 1 : suffix) * arr[n - 1 - i];
            maxProd = Math.max(maxProd, Math.max(prefix, suffix));
        }
        return maxProd;
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
        int result = maxProduct(arr);
        System.out.print("The max subarray product is : " + result);
    }
}
