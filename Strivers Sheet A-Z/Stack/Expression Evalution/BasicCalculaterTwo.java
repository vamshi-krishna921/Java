import java.util.Stack;

public class BasicCalculaterTwo {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char sign = '+';
        int num = 0;
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                if (sign == '+') {
                    st.push(num);
                } else if (sign == '-') {
                    st.push(-num);
                } else if (sign == '*') {
                    top = st.pop();
                    st.push(top*num);
                } else if (sign == '/') {
                    top = st.pop();
                    st.push(top/num);
                }
                sign = ch;
                num = 0;
            }
        }
        int result = 0;
        for(int elem : st){
            result += elem;
        }
        return result;
    }
}
