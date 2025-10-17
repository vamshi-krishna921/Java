import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        sc.nextLine();
        String isEven = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + isEven);
    }
}
