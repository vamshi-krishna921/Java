import java.util.Scanner;

public class subStringpresent {

    static boolean isPresent(String str, String goal) {
        StringBuilder sb = new StringBuilder(str).append(str);
        return sb.toString().contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the goal: ");
        String goal = sc.next();
        if (isPresent(str, goal)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

    }
}
