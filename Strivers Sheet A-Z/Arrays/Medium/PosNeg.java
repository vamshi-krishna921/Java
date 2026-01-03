import java.util.Scanner;

public class PosNeg {
    static int[] arrangePosNeg(int arr[]) {

        // * Optimal only if the pos and neg values are equal and no 0's */
        int[] resultArr = new int[arr.length];
        int neg = 1;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                resultArr[neg] = arr[i];
                neg += 2;
            } else {
                resultArr[pos] = arr[i];
                pos += 2;
            }
        }
        return resultArr;
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
        int result[] = arrangePosNeg(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
