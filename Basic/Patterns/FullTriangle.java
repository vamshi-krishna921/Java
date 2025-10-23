public class FullTriangle {
    public static void main(String[] args) {

        //* Space

        // for (int i = 0; i < 5; i++) {
        //     for (int space = 4 - i; space > 0; space--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //* With stars
          for (int i = 1; i <= 5; i++) {
            for (int space = 5; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
