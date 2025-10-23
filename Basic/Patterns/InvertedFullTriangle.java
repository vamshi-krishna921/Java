public class InvertedFullTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int j = 7; j >= (2 * i) -  1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
