import java.util.Scanner;

public class EvenOddNums {
    static int[] countEvenOdd(int arr[]) {
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[] { even, odd };
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
        int[] result = countEvenOdd(arr);
        System.out.print("The even numbers are : " + result[0] + " Odd numbers are : " + result[1]);
    }
}
