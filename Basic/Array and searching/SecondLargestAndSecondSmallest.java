import java.util.Scanner;

public class SecondLargestAndSecondSmallest {

    static int[] secondSmallestLargest(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            // * Second largest */
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

            // * second smallest */
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return new int[] { secondLargest, secondSmallest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = secondSmallestLargest(arr);
        System.out.println("The second largest is " + result[0] + " second smallest is " + result[1]);
    }
}
