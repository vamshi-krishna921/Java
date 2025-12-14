import java.util.Scanner;

public class SumandAvg {
    static int sumAvg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
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
        int sum = sumAvg(arr);
        int avg = sum / (arr.length - 1);
        System.out.print("The sum is " + sum + " and the avg is " + avg);
    }
}
