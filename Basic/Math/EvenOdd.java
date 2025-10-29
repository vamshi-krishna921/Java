import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int even = 0;
        int odd = 0;
        if (number < 0) {
            System.out.println("Enter number > 0");
            System.exit(even);
        }
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number /= 10;
        }
        System.out.println("Even count : " + even + "\n" + "Odd count : " + odd);
    }
}
