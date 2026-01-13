import java.util.Scanner;

public class missingRepeating {

    // ! Brute force (using 2 loops)
    static int[] findMissingRepeating(int[] arr) {
        int missing = -1, repeating = -1;
        // for (int i = 1; i <= arr.length; i++) {
        // int count = 0;
        // for (int j = 0; j < arr.length; j++) {
        // if (i == arr[j]) {
        // count++;
        // }
        // }
        // if (count == 0) {
        // missing = i;
        // }
        // if (count == 2) {
        // repeating = i;
        // }
        // }

        // * Better soln using hashing
        // int[] hash = new int[arr.length+1];
        // for (int i = 0; i < arr.length; i++) {
        // hash[arr[i]]++;
        // }
        // for (int i = 1; i < hash.length; i++) {
        // if (hash[i] == 0) {
        // missing = i;
        // }
        // if (hash[i] == 2) {
        // repeating = i;
        // }
        // }

        // TODO Optimal using math
        int n = arr.length;
        int sum1 = (n * (n + 1)) / 2;
        int squareSum1 = (n * (n + 1)) * (2 * n + 1) / 6;
        int squareSum2 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
            squareSum2 += arr[i] * arr[i];
        }
        int value1 = sum1 - sum2;
        int value2 = squareSum1 - squareSum2;
        value2 = value2 / value1;
        missing = (value1+value2)/2;
        repeating = missing - value1;

        return new int[] { missing, repeating };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = findMissingRepeating(arr);
        System.out.print("The missing number : " + result[0] + " and the repeating number : " + result[1]);
    }
}
