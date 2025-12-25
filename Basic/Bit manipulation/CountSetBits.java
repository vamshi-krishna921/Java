import java.util.Scanner;

public class CountSetBits {
    static int countSets(int num) {
        int shift = 1;
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> shift;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("The no. of set bits are " + countSets(num));
    }
}
