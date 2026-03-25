import java.util.Stack;
class Solution {
    public String reverse(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<S.length(); i++){
            stack.push(S.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            char c = stack.pop();
            result.append(c);
        }
        return result.toString();
    }
}
