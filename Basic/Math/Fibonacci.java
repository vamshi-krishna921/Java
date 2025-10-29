import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number : ");
        long input = sc.nextLong();
        long first = 0;
        long second = 1;
        System.out.print("The fibonacci series: ");
        for (int i = 1; i <= input; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
