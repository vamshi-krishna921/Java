import java.util.ArrayList;
import java.util.Scanner;

public class rotateArrayByKPos {
    static void rotateArray(int[] arr, int start, int end) {

        // ! Brute force approach
        // if (arr.length == 0) {
        // return;
        // }
        // k = k % arr.length;
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < k; i++) {
        // list.add(arr[i]);
        // }
        // int n = arr.length;
        // for (int i = k; i < arr.length; i++) {
        // arr[i-k] = arr[i];
        // }
        // int j = 0;
        // for (int i = n-k; i < arr.length; i++) {
        // arr[i] = list.get(j);
        // j++;
        // }

        // TODO Optimal solution
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
        System.out.print("Enter the no of rotations : ");
        int k = sc.nextInt();

        // ! Brute force approach
        // rotateArray(arr, k);

        // TODO Optimal solution
        k = k % size;
        rotateArray(arr, 0, k-1);
        rotateArray(arr, k, size - 1);
        rotateArray(arr, 0, size - 1);
        System.out.print("The rotated array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
