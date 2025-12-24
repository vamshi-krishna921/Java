import java.util.Scanner;

public class Set_i_th_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the bit position to change : ");
        int i = sc.nextInt();
        num = num | (1 << i);
        System.out.println(num);

    }
}
