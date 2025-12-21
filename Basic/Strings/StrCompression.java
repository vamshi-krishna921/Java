import java.util.Scanner;

public class StrCompression {
    static String compress(String str) {
        StringBuilder newStr = new StringBuilder();
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            char ch = str.charAt(i);
            while (i < str.length()-1 && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(ch);
            if (count > 1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("The compressed string is " + compress(str));
    }
}