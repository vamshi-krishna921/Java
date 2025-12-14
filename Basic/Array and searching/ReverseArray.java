import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numbers : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // * Using new array */
        // int[] reversedArray = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // reversedArray[i] = arr[size - (i+1)];
        // }
        // for (int i = 0; i < reversedArray.length; i++) {
        // System.out.print(reversedArray[i] + " ");
        // }

        // * Without using new array */
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("The reversed array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
