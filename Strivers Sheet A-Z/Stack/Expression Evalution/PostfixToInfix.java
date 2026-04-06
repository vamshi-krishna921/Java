import java.util.Stack;

public class PostfixToInfix {

    public static String convert(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = "(" + op1 + ch + op2 + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "AB+C*";
        System.out.println(convert(exp));
    }
}
