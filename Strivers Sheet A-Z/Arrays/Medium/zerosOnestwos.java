import java.util.Scanner;

public class zerosOnestwos {
    static void zeroOneTwo(int[] arr) {
        // ! Brute is merge
        // * Better soln Counting and adding
        // int zeros = 0;
        // int ones = 0;
        // int twos = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // zeros++;
        // }else if (arr[i] == 1) {
        // ones++;
        // }else{
        // twos++;
        // }
        // }
        // for (int i = 0; i < zeros; i++) {
        // arr[i] = 0;
        // }
        // for (int i = zeros; i < zeros + ones; i++) {
        // arr[i] = 1;
        // }
        // for (int i = zeros + ones; i < arr.length; i++) {
        // arr[i] = 2;
        // }

        // TODO Optimal (Dutch National Flag algo)
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        System.out.print("The sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        zeroOneTwo(arr);
    }
}
