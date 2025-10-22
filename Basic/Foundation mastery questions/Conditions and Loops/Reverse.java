import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        sc.nextLine();
        int revNum = 0;
        while (number != 0) {
            int num = number % 10;
            revNum = (revNum * 10) + num;
            number /= 10;
        }
        System.err.println(revNum);
        sc.close();
    }
}
