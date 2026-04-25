import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElemOne {

    public static int[] findNextGreater(int[] arr) {
        // ! Brute force
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < result.length; j++) {
        // if (arr[i] < arr[j]) {
        // result[i] = arr[j];
        // break;
        // }
        // }
        // }
        // return result;

        // * Optimal using array and stack by traversing the array in reverse order
        // (Next greater right)*/
        // Stack<Integer> stack = new Stack<>();
        // stack.push(arr[arr.length-1]);
        // for (int i = arr.length-2; i >= 0; i--) {
        // if (arr[i] < stack.peek()) {
        // result[i] = stack.peek();
        // stack.push(arr[i]);
        // }else{
        // stack.pop();
        // while ((!stack.isEmpty()) && (arr[i] > stack.peek())) {
        // stack.pop();
        // }
        // if (!stack.isEmpty()) {
        // result[i] = stack.peek();
        // }
        // stack.push(arr[i]);
        // }
        // }
        // return result;

        // TODO *GFG Next greater right
        // ArrayList<Integer> list = new ArrayList<>();
        // Stack<Integer> stack = new Stack<>();
        // stack.push(arr[arr.length - 1]);
        // list.add(-1);
        // for (int i = arr.length - 2; i >= 0; i--) {
        // while ((!stack.isEmpty()) && (arr[i] >= stack.peek())) {
        // stack.pop();
        // }
        // if (!stack.isEmpty()) {
        // list.add(stack.peek());
        // } else {
        // list.add(-1);
        // }
        // stack.push(arr[i]);
        // }
        // Collections.reverse(list);
        // return list;

        // TODO *GFG Next greater left
        // ArrayList<Integer> list = new ArrayList<>();
        // Stack<Integer> stack = new Stack<>();
        // for (int i = 0; i < arr.length ; i++) {
        // while ((!stack.isEmpty()) && (arr[i] >= stack.peek())) {
        // stack.pop();
        // }
        // if (!stack.isEmpty()) {
        // list.add(stack.peek());
        // } else {
        // list.add(-1);
        // }
        // stack.push(arr[i]);
        // }
        // return list;

        // TODO *GFG Smaller elem left
        // ArrayList<Integer> list = new ArrayList<>();
        // Stack<Integer> stack = new Stack<>();
        // for (int i = 0; i < arr.length; i++) {
        // while ((!stack.isEmpty()) && (arr[i] <= stack.peek())) {
        // stack.pop();
        // }
        // if (!stack.isEmpty()) {
        // list.add(stack.peek());
        // } else {
        // list.add(-1);
        // }
        // stack.push(arr[i]);
        // }
        // return list;

        // TODO Next smaller elem right
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        list.add(-1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while ((!stack.isEmpty()) && (arr[i] <= stack.peek())) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                list.add(stack.peek());
            } else {
                list.add(-1);
            }
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elems");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = findNextGreater(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
