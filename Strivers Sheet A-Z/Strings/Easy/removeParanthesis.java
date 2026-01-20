import java.util.Scanner;

public class removeParanthesis {
    static String remove(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                count--;
            }
            if (count != 0) {
                result.append(ch);
            }
            if (ch == '(') {
                count++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = remove(str);
        System.out.println(result);
    }
}
