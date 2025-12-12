import java.util.Scanner;
import java.lang.Math;

public class decToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int num = sc.nextInt();
        int power = 0;
        int binNum = 0;
        while (num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int) (Math.pow(10, power)));
            power++;
            num /= 2;
        }
        System.out.println(binNum);
    }
}
