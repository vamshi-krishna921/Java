import java.util.Scanner;

public class SumofDigits {

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end number : ");
        int end = sc.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= end; i++) {
            totalSum += sumOfDigits(i);
        }
        System.out.println("The sum is : " + totalSum);
    }
}
