import java.util.Scanner;

public class RangePerfect {
    // Function declaration
    static int isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return num;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = sc.nextInt();
        System.out.print("Enter the end number: ");
        int end = sc.nextInt();
        for (int i =start; i <= end; i++) {
            if (isPerfect(i) != -1) {
                System.out.print(i + " ");
            }
        }
    }
}
