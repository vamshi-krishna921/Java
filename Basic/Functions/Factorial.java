import java.util.Scanner;

public class Factorial {

    static int fact(int num) {
        if (num == 0 || num ==1)
            return 1;
        else
            return (num * fact(num - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int factorial = fact(number);
        System.out.print("The factorial of " + number + " : " + factorial);
    }
}
