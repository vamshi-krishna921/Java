public class InvertedAlphabeticTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            char alpha = (char) ('I' - (2 * i) + 2);
            for (char j = alpha; j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
