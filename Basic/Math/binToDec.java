import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int num = sc.nextInt();
        int power = 0;
        int decimalNum = 0;
        while (num > 0) {
            int digit = num % 10;
            decimalNum = decimalNum + (int) (digit * Math.pow(2, power));
            num /= 10;
            power++;
        }
        System.out.println(decimalNum);
    }
}
