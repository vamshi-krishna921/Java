import java.util.Scanner;

public class ReverseWords {

    static String reverse(String str) {
        String[] s = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("The reverse words: " + reverse(str));
    }
}
