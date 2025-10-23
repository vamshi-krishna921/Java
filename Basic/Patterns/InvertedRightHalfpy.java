public class InvertedRightHalfpy {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
