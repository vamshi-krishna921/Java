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
        //     for (int j = i + 1; j < result.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             result[i] = arr[j];
        //             break;
        //         }
        //     }
        // }
        // return result;

        //* Optimal using array and stack by traversing the array in reverse order*/
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length-1]);
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] < stack.peek()) {
                result[i] = stack.peek();
                stack.push(arr[i]);
            }else{
                stack.pop();
                while ((!stack.isEmpty()) && (arr[i] > stack.peek())) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    result[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
        }
        return result;
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
