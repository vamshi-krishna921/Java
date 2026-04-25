import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElemTwo {
      ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int num : nums) {
            list.add(num);
        }
        Stack<Integer> stack = new Stack<>();
        int size = list.size();
        int n = nums.length;
        stack.push(list.get(list.size() - 1));
        for (int i = size - 1; i >= 0; i--) {
            while ((!stack.isEmpty()) && (list.get(i) >= stack.peek())) {
                stack.pop();
            }
            if(i < n){
                nums[i] = stack.isEmpty() ? -1 : stack.peek();
            }g
            stack.push(list.get(i));
        }
        return nums;
}
