import java.util.Scanner;

public class Clear_i_bits {
    static int Clear_i_no_bits(int n, int i){
        int masking = (~0)<<i;
        return n & masking;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the no. of bits to clear : ");
        int i = sc.nextInt();
        System.out.println(Clear_i_no_bits(num, i));
    }
}
