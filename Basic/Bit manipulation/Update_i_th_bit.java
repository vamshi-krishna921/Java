import java.util.Scanner;

public class Update_i_th_bit {

    static int Clear_i_th_bit(int n, int i) {
        int masking = ~(1 << i);
        return n & masking;
    }
    static int Set_i_th_bit(int n, int i) {
        int masking = (1 << i);
        return n | masking;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the bit position to change : ");
        int i = sc.nextInt();
        System.out.print("Enter the bit to add : ");
        int newBit = sc.nextInt();
        if (newBit == 0) {
            System.out.println(Clear_i_th_bit(num, i));
        } else {
            System.out.println(Set_i_th_bit(num, i));
        }
    }
}