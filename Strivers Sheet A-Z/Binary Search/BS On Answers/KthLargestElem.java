import java.util.Scanner;

public class KthLargestElem {
    static int mergeArrays(int[] arr1, int[] arr2, int key) {
        int merArr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merArr[index] = arr1[i];
                index++;
                i++;
            } else {
                merArr[index] = arr2[j];
                index++;
                j++;
            }
        }
        while (i < arr1.length) {
            merArr[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length) {
            merArr[index] = arr2[j];
            index++;
            j++;
        }
        return merArr[key - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1:  ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2:  ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter the key:");
        int key = sc.nextInt();
        System.out.println("The kth largest elem is " + mergeArrays(arr1, arr2, key));
    }
}
