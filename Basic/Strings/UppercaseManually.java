import java.util.Scanner;

public class UppercaseManually {
    static String lowerToUpper(String str) {
        String result = new String();
        result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the word : ");
        str = sc.next();
        System.out.println("The string is converted to upper case manually : " + lowerToUpper(str));
    }
}
