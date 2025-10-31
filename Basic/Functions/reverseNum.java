import java.util.Scanner;

public class reverseNum {
    static int reverseNumber(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = (revNum * 10) + digit;
            num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int revNum = reverseNumber(number);
        System.out.print("The reverse of " + number + " : " + revNum);
    }
}
