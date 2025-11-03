import java.util.Scanner;
import java.lang.Math;

public class armStrong {

    // * Function defination
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int length = String.valueOf(original).length();
        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, length);
            num /= 10;
        }
        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n > 0) {
            // if (isArmstrong(n)) {
            // System.out.println(n + " is armstrong number.");
            // } else {
            // System.out.println(n + " is not a armstrong number.");
            // }
            System.out.println(n + (isArmstrong(n) ? " is a armstrong number" : " not a armstrong number"));
        } else {
            System.out.println("Enter the number > 0.");
        }
    }
}
