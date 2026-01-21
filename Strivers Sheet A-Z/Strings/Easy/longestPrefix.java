import java.util.Arrays;
import java.util.Scanner;

public class longestPrefix {
    static String prefix(String[] str) {
        if (str.length == 0)
            return "";
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int minLen = Math.min(first.length(), last.length());
        for (int i = 0; i < minLen; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return first.substring(0, i);
            }
        }
        return first.substring(0, minLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.print("Enter the string: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        String result = prefix(str);
        System.out.println(result);
    }
}
