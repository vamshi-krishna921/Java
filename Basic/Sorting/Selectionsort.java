import java.util.Scanner;

public class Selectionsort {
    static void sortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int midIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[midIndex] > arr[j]) {
                    midIndex = j;
                }
            }
            // *Swap
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }
        System.out.print("Sorted array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
        sortedArray(arr);
    }
}
