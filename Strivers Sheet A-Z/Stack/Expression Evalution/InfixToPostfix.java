import java.util.Stack;

public class InfixToPostfix {

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
        // Remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.peek());
            stack.pop();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String ans = inToPost("(A+B)*(C-D)/(E+F*G)+H");
        System.out.println(ans);
    }
}
