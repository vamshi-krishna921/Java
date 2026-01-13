import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    static void mergeArray(int[] arr1, int[] arr2, int m, int n) {
        // ! Brute force using 3rd array and merging it in 1st array
        // int arr3[] = new int[m + n];
        // int left = 0, right = 0, index = 0;
        // while (left < m && right < n) {
        // if (arr1[left] <= arr2[right]) {
        // if (arr1[left] == 0) {
        // left++;
        // continue;
        // }
        // arr3[index] = arr1[left];
        // left++;
        // index++;
        // } else {
        // arr3[index] = arr2[right];
        // right++;
        // index++;
        // }
        // }
        // while (left < m) {
        // if (arr1[left] == 0) {
        // left++;
        // continue;
        // }
        // arr3[index] = arr1[left];
        // left++;
        // index++;
        // }
        // while (right < n) {
        // arr3[index] = arr2[right];
        // right++;
        // index++;
        // }
        // for (int i = 0; i < m; i++) {
        // arr1[i] = arr3[i];
        // }

        // * Better (No extra space)
        // int left = arr1.length-1, right = 0;
        // while (left>= 0 && right<n) {
        // if (arr2[right] <= arr1[left]) {
        // int temp = arr1[left];
        // arr1[left] = arr2[right];
        // arr2[right] = temp;
        // }
        // right++;
        // left--;
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // for (int i : arr1) {
        // System.out.print(i + " ");
        // }
        // for (int elem : arr2) {
        // System.out.print( elem + " ");
        // }

        // TODO Optimal solution using gap method (Shell sort method)
        int gap = (m + n) / 2 + (m + n) % 2;
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < m + n) {
                // ? Both in arr1
                if (i < m && j < m) {
                    if (arr1[i] > arr1[j]) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
                // ? i in arr1, j in arr2
                else if (i < m && j >= m) {
                    if (arr1[i] > arr2[j - m]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }
                // ? i in arr2 and j in arr2
                else {
                    if (arr1[i - m] > arr2[j - m]) {
                        int temp = arr2[i - m];
                        arr2[i - m] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }
                i++;
                j++;
            }
            if (gap == 1)
                break;
            gap = (gap + 1) / 2;
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
        mergeArray(arr1, arr2, size1, size2);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}