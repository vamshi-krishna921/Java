import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // * Formula lcm = (num1 * num2) / GCD

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        // int a = num1;
        // int b = num2;
        // while (num1 > 0 && num2 > 0) { 
        // if (num1 > num2) {
        // num1 = num1 % num2;
        // } else {
        // num2 = num2 % num1;
        // }
        // }
        // int gcd = (num1 == 0) ? num2 : num1;
        // int lcm = (a * b) / gcd;
        // System.out.println(lcm);

        // ! Without formula
        int lcm = 0;
        int maxNum = Math.max(num1, num2);
        while (true) {
            if (maxNum % num1 == 0 && maxNum % num2 == 0) {
                lcm = maxNum;
                break;
            }
            maxNum++;
        }
        System.out.println(lcm);
    }
}
