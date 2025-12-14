import java.util.Scanner;

public class sortedOrNot {
    static boolean isSorted(int arr[]) {
        if (arr.length <= 1) {
            return true;
        }
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (first > arr[i]) {
                return false;
            }
            first = arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numbers : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr)) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
