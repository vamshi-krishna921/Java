import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String result = (num & 1) == 0 ? "Even" : "Odd";
        System.out.print("The " + num + " is " + result);
    }
}
