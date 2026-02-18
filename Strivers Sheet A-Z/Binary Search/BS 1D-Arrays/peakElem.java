import java.util.Scanner;

public class peakElem {
    static int search(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        return -1;
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
        System.out.print("The upper bound found at index : " + search(arr));
    }
}
