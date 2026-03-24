import java.util.Scanner;
import java.util.Stack;

public class AddAtBtm {

    public static void pushBtm(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int top = stack.pop();
        pushBtm(stack, val);
        stack.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (true) {
            System.out.println("1. Push into stack: ");
            System.out.println("2. Push at bottom of stack: ");
            System.out.println("3. Pop from stack: ");
            System.out.println("4. Print stack:  ");
            System.out.println("5. Exit ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter the value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    System.out.println("Enter the value: ");
                    int val1 = sc.nextInt();
                    pushBtm(stack, val1);
                    break;
                case 3:
                    stack.pop();
                    break;
                case 4:
                    // System.out.println(stack);
                    while (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid syntax, Try again!");
                    break;
            }
        }
    }
}
