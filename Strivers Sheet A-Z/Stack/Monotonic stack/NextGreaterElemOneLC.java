package Monotonic stack;

public class NextGreaterElemOneLC {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(num2[num2.length - 1]);
        map.put(num2[num2.length - 1], -1);
        for (int i = num2.length - 2; i >= 0; i--) {
            while ((!stack.isEmpty()) && (num2[i] >= stack.peek())) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(num2[i], -1);
            } else {
                map.put(num2[i], stack.peek());
            }
            stack.push(num2[i]);
        }
        for (int i = 0; i < num1.length; i++) {
            num1[i] = map.get(num1[i]);
        }
        return num1;
    }
}
