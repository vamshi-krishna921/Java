import java.util.Scanner;
public class secondLargest {
    static int secLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = Math.max(largest, arr[i]);
            }else if (arr[i] > second && arr[i] < largest ) {
                second = arr[i];
            }
        }
        return second;
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
        System.out.print("The second largest is " + secLargest(arr));
    }
}
