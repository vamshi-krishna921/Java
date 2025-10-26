public class HollowRhombus {
    public static void main(String[] args) {
        int n = 3;
        // * Upper part
        for (int i = 1; i <= n; i++) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // * Lower Part
        for (int i = n - 1; i >= 1; i--) {
            for (int space = i; space <= n; space++) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j >= 1; j--) {
                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
