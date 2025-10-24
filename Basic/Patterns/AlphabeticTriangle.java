public class AlphabeticTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 5; space >= i; space--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j < 'A' + (2 * i) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
