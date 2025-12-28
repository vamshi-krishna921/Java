import java.util.Scanner;

public class ArrayIsSortedOrNot {
    static boolean isSorted(int arr[]) {
        boolean ascOrder = false;
        boolean desOrder = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                ascOrder = true;
            } else if (arr[i] > arr[i + 1]) {
                desOrder = true;
            }
        }
        return !(ascOrder && desOrder);
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
        if (isSorted(arr)) {
            System.out.print("The array is sorted.");
        } else {
            System.out.print("Array is not sorted.");
        }
    }
}
