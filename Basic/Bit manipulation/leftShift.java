import java.util.Scanner;
public class leftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int a = sc.nextInt();
        System.out.print("Enter the no. of bits to shift left: ");
        int b = sc.nextInt();
        System.out.print(a << b);
    }
}
