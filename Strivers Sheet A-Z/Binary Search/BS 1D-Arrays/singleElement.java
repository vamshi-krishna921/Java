import java.util.Scanner;

public class singleElement {
    static int search(int[] arr){
        if (arr.length == 1) {
            return arr[0];
        }
        int low = 0, high = arr.length-1;
        if (arr[low] != arr[low+1]) {
            return arr[low];
        }
        if (arr[high] != arr[high-1]) {
            return arr[high];
        }
        while (low<=high) {
            int mid = low + (high-low)/2;
            if ((mid%2==1 && arr[mid] == arr[mid -1]) || (mid%2==0 && arr[mid] == arr[mid+1])) {
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return arr[low];
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
        System.out.print("The upper bound found at index : " + search(arr));
    }
}
