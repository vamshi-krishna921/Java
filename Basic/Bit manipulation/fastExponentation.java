import java.util.Scanner;

public class fastExponentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the exponent (or) power : ");
        int pow = sc.nextInt();
        int result = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {
                result *= num;
            }
            num *= num;
            pow = pow >> 1;
        }
        System.out.print(result);
    }
}
