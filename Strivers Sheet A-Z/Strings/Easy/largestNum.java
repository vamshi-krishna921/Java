import java.util.Scanner;

public class largestNum {
    static String ans(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine();
        String result = ans(num);
        for (int i = 0; i < result.length(); i++) {
            System.out.print(num.charAt(i));
        }

    }
}