import java.util.Scanner;

public class minRotatedSortedArray {
    static int search(int arr[]){
        int min = Integer.MAX_VALUE;
        int low = 0, high = arr.length-1;
        while (low<=high) {
            int mid = low + (high - low)/2;
            if (arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid + 1;
            }else{
                min = Math.min(min, arr[mid]);
                high = mid -1;
            }
        }
        return min;
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
        System.out.print("The elem found at : " + search(arr));
    }
}