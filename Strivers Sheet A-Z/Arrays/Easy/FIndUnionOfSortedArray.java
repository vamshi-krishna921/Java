import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FIndUnionOfSortedArray {
    static void findUnion(int arr1[], int arr2[]) {

        // ! Brute force
        // HashSet<Integer> set = new HashSet<>();
        // for (int elem : arr1) {
        // set.add(elem);
        // }
        // for (int elem : arr2) {
        // set.add(elem);
        // }
        // int[] newArr = new int[set.size()];
        // int i = 0;
        // for (int elem : set) {
        // newArr[i] = elem;
        // i++;
        // }

        // * Optimal soln using two pointers */
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int s1 = arr1.length;
        int s2 = arr2.length;
        while (i < s1 && j < s2) {
            if (arr1[i] <= arr2[j]) {
                if (!list.contains(arr1[i])) {
                    list.add(arr1[i]);
                    i++;
                }
            }
            if (arr2[j] <= arr1[i]) {
                if (!list.contains(arr2[j])) {
                    list.add(arr2[j]);
                    j++;
                }
            }
        }
        for (Integer elem : list) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1 : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements: ");
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2 : ");
        int size1 = sc.nextInt();
        System.out.print("Enter the " + size1 + " elements: ");
        int[] arr2 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr2[i] = sc.nextInt();
        }
        findUnion(arr1, arr2);
    }
}
