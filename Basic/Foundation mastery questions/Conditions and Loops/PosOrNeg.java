import java.util.*;

public class PosOrNeg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ! Check if a number is positive negative or zero
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        String isPositive = (number > 0) ? "Positive" : "Negative";
        System.out.println("The given number is " + isPositive);
    }
}