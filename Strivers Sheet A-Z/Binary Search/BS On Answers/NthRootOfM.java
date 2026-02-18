import java.util.Scanner;

public class NthRootOfM {
    static int search(int n, int m) {
        if (m == 0) {
            return 0;
        }
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= mid;
            }
            if (ans == m) {
                return mid;
            }
            if (ans > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int m = sc.nextInt();
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("The result is " + search(n, m));
    }
}
