import java.util.Scanner;

public class Get_i_th_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the bit position to find : ");
        int i = sc.nextInt();
        if ((num & (1 << i)) != 0) {
            System.out.println("Bit is 1");
        } else {
            System.out.println("Bit is 0");
        }
    }
}
