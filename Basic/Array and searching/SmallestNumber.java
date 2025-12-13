import java.util.Scanner;

public class SmallestNumber {
    static int smallestNumber(int arr[]) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
        }
        return smallest;

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
        System.out.print("The smallest number is : " + smallestNumber(arr));
    }
}
