import java.util.Scanner;
public class LargestElem {
    static int larElem(int arr[]){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        return largest;
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
        System.out.print("The largest element in array is " + larElem(arr));
    }    
}