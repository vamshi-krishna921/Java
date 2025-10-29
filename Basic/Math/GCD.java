import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        // int gcd = 0;
        // for (int i = 1; i <= Math.min(num1, num2); i++) {
        // if (num1 % i == 0 && num2 % i ==0) {
        // gcd = i;
        // } 
        // }
        // System.out.println(gcd);

        //! Using Euclidian algorithm
        // * gcd(a,b) = gcd(a%b,b);
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            }else{
                num2 = num2 % num1;
            }
        }
        if (num1 == 0) {
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
    }
}
