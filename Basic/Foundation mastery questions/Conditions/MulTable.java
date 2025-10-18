import java.util.*;

public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + "  = " + (number * i));
        }
    }
}
