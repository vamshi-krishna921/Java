import java.util.Scanner;
import java.util.Stack;

public class DailyTemp {

    public static int[] temp(int[] arr) {

        // ! Brute force
        // int[] result = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < result.length; j++) {
        // if (arr[j] > arr[i]) {
        // result[i] = j - i;
        // break;
        // }
        // }
        // }
        // result[result.length - 1] = 0;
        // return result;

        // TODO Optimal
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        result[result.length - 1] = 0;
        stack.push(temperatures.length - 1);
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] result = temp(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
