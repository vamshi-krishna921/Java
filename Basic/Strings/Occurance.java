import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != i || ch == ' ') continue;
            int originalLength = str.length();
            String modified = str.replace(ch + "", "");
            int count = originalLength - modified.length();
            System.out.println(ch + " occurred for " + count);
        }
    }
}
