public class ABBBCCCCC {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 5; space >= i; space--) {
                System.out.print(" ");
            }
            char letter = (char) ('A' + i - 1);
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
