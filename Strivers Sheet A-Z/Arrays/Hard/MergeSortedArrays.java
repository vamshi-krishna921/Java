import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    static void mergeArray(int[] arr1, int[] arr2, int m, int n) {
        // ! Brute force using 3rd array and merging it in 1st array
        // int arr3[] = new int[m + n];
        // int left = 0, right = 0, index = 0;
        // while (left < m && right < n) {
        //     if (arr1[left] <= arr2[right]) {
        //         if (arr1[left] == 0) {
        //             left++;
        //             continue;
        //         }
        //         arr3[index] = arr1[left];
        //         left++;
        //         index++;
        //     } else {
        //         arr3[index] = arr2[right];
        //         right++;
        //         index++;
        //     }
        // }
        // while (left < m) {
        //     if (arr1[left] == 0) {
        //         left++;
        //         continue;
        //     }
        //     arr3[index] = arr1[left];
        //     left++;
        //     index++;
        // }
        // while (right < n) {
        //     arr3[index] = arr2[right];
        //     right++;
        //     index++;
        // }
        // for (int i = 0; i < m; i++) {
        //     arr1[i] = arr3[i];
        // }

        //* Optimal (No extra space)
        int left = arr1.length-1, right = 0;
        while (left>= 0 && right<n) {
            if (arr2[right] <= arr1[left]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }
            right++;
            left--;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int elem : arr2) {
            System.out.print( elem + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1 : ");
        int size1 = sc.nextInt();
        System.out.print("Enter the " + size1 + " elements : ");
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2 : ");
        int size2 = sc.nextInt();
        System.out.print("Enter the " + size2 + " elements : ");
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeArray(arr1, arr2, arr1.length, arr2.length);
        // for (int i : arr1) {
        //     System.out.print(i + " ");
        // }
    }
}
