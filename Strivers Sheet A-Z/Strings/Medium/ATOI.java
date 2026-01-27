import java.util.Scanner;

public class ATOI {
    static int StringToInt(String str) {
        str = str.trim();
        if (str.length() < 1) {
            return 0;
        }
        int sign = 1;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
        }
        int start = 0;
        long ans = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            start = 1;
        }
        while (start < str.length()) {
            if (str.charAt(start) == ' ' || !Character.isDigit(str.charAt(start))) {
                break;
            }
            ans = ans * 10 + (str.charAt(start) - '0');
            if (sign == -1 && -1 * ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign == 1 && 1 * ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            start++;
        }
        return (int) (sign * ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("The integer value is : " + StringToInt(str));
    }
}
