import java.util.Scanner;
public class MergeSort {

    // * conquer the divided arrays
    static void conquer(int arr[], int start, int mid, int end) {
        int[] mergedArray = new int[end - start + 1];
        int index1 = start, index2 = mid + 1, x = 0;
        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                mergedArray[x++] = arr[index1++];
            } else {
                mergedArray[x++] = arr[index2++];
            }
        }
        // * Remaining elems may have those are sorted in left array
        while (index1 <= mid) {
            mergedArray[x++] = arr[index1++];
        }
        // * Remaining elems may have those are sorted in right array
        while (index2 <= end) {
            mergedArray[x++] = arr[index2++];
        }
        for (int i = 0; i < mergedArray.length; i++) {
            arr[start++] = mergedArray[i];
        }
    }

    // * divide the array into halves
    static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2; // start + (end - start) /2;
        divide(arr, start, mid); // ? Left divide array
        divide(arr, mid + 1, end); // ? Right divide array
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, size - 1);
        System.out.print("The sorted array is ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
