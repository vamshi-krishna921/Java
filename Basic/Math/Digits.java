import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int count = 0;
        if (number < 0) {
            System.out.println("Enter number > 0");
            System.exit(count);
        }
        while (number>0) {
            int digit = number%10;
            count++;
            number/=10;
        }
        System.out.println(count);
    }
}
