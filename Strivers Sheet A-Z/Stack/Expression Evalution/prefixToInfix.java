import java.util.Stack;

public class prefixToInfix {
    public static String convert(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + ch + op2 + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "-+A*BC/DE";
        System.out.println(convert(exp));
    }
}
