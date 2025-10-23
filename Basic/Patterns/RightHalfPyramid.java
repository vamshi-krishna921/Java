public class RightHalfPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 5-i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
