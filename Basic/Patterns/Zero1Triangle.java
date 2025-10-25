public class Zero1Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 4; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
