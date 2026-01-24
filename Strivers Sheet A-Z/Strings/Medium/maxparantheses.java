import java.util.Scanner;

public class maxparantheses {
    static int maxPar(String str) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (ch == ')') {
                count--;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print(maxPar(str));
    }
}
