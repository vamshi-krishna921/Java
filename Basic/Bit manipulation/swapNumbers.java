import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.println("Before swapping num1 = " + num1 + " num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping num1 = " + num1 + " num2 = " + num2);
    }
}