import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int a = sc.nextInt();
        System.out.print("Enter the b value : ");
        int b = sc.nextInt();
        System.out.print(a | b);
    }
}