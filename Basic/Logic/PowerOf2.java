import java.util.Scanner;
public class PowerOf2 {
    static int highestPowerOf2(int n) {
        int power = 1;
        while (power * 2 < n) {
            power *= 2;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Highest power of 2 less than " + n + " is: " + highestPowerOf2(n));
    }
}