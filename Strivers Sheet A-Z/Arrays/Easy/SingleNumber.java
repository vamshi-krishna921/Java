import java.util.Scanner;

public class SingleNumber {
    static int singleNum(int arr[]){
        int single = 0;
         for(int i = 0; i<arr.length;i++){
            single ^= arr[i];
        }
        return single;
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
        System.out.print("The single number is " + singleNum(arr));
    }
}
