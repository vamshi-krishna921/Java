import java.util.Scanner;

public class subArraySumisK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k value: ");
        int k = sc.nextInt();
        int sum = 0;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if (sum < k) {
                    sum += arr[j];
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    break;
                }
            }
        }
        System.out.print(maxCount);
    }
}
