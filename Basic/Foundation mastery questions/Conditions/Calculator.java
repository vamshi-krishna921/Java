import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value num1: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the operator :");
        String operator = sc.next();
        sc.nextLine();
        System.out.print("Enter the num2 :");
        int num2 = sc.nextInt();
        sc.nextLine();
        switch (operator) {
            case "+":
                System.out.println("The addition of 2 numbers is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The substraction of 2 numbers is " + (num1 - num2));
                break;
            case "*":
                System.out.println("The multiplication of 2 numbers is " + (num1 * num2));
                break;
            case "/":
                System.out.println("The divison of 2 numbers is " + (num1 / num2));
                break;
            case "%":
                System.out.println("The modulos of 2 numbers is " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operand");
                break;
        }
        sc.close();
    }
}
