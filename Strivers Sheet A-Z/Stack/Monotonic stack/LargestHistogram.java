import java.util.Stack;

public class LargestHistogram {

    public static int findLargestHistogram(int[] arr) {
        // ! Brute force approach
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                int width = j - i + 1;
                int area = minHeight * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;

        // *Optimal using next smaller left + next smaller right(Here we push index instead of values into stack)
        Stack<Integer> stack = new Stack<>();
        // Finding next smaller to left
        int[] nsl = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear the stack
        stack.clear();

        // Finding next smaller to right
        int[] nsr = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }

        // Finding largest histogram
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            res = Math.max(area, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        int result = findLargestHistogram(arr);
        System.out.println(result);
    }
}
