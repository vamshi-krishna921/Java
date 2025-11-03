import java.util.Scanner;

public class SumOfPrime {

    static boolean isPrime(int digit) {
        if (digit<2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfPrime(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("The sum of prime in a number : " + sumOfPrime(num));
    }
}
