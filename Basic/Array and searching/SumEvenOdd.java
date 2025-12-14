import java.util.Scanner;

public class SumEvenOdd {
    static int[] sumEvenOdd(int arr[]){
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                sumEven += arr[i];
            }else{
                sumOdd += arr[i];
            }
        }
        return new int[] {sumEven,sumOdd};
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
        int[] result = sumEvenOdd(arr);
        System.out
                .println("The sum of even indexed values is " + result[0] + " and odd indexed values is " + result[1]);
    }
}
