import java.util.Stack;

public class BasicCalcOne {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int num = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                if (ch == '+') {
                    result += (sign * num);
                    num = 0;
                    sign = 1;
                } else if (ch == '-') {
                    result += (sign * num);
                    num = 0;
                    sign = -1;
                } else if (ch == '(') {
                    stack.push(result);
                    stack.push(sign);
                    num = 0;
                    result = 0;
                    sign = 1;
                } else if (ch == ')') {
                    result += sign * num;
                    result = stack.pop() * result; // sign
                    result += stack.pop(); // previous result
                    num = 0;
                }
            }
        }
        result += (sign * num);
        return result;
    }
}
