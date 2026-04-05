import java.util.Stack;

public class InfixToPrefix {

    // Reverse the string and swap brackets
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '(')
                sb.append(')');
            else if (ch == ')')
                sb.append('(');
            else
                sb.append(ch);
        }
        return sb.toString();
    }

    // Precedence check
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        if (operator == '^') {
            return 3;
        }
        return -1;
    }

    public static String inToPost(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() &&
                        (precedence(stack.peek()) > precedence(ch) ||
                                (precedence(stack.peek()) == precedence(ch) && ch != '^'))) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        // Remaining operators add to string
        while (!stack.isEmpty()) {
            result.append(stack.peek());
            stack.pop();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // 1. Reverse infix string
        String revString = reverseString("(A+B)*(C-D)");
        // 2. Infix to postfix
        String ans = inToPost(revString);
        // 3. Reverse postfix string
        StringBuilder sb = new StringBuilder(ans);
        String revPostfix = sb.reverse().toString();
        System.out.println(revPostfix);
    }
}
