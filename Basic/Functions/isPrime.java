import java.util.Scanner;

public class isPrime {

    static int checkPrime(int number, int count) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number > 0 : ");
        int num = sc.nextInt();
        int count = 0;
        int prime = checkPrime(num, count);
        if (num <= 0) {
            System.out.println("Input is <= 0. Please try again.");
            System.exit(prime);
        }
        if (prime == 0) {
            System.out.println(num + " is a prime number.");
        } else
            System.out.println(num + " not a prime number.");

    }
}
