public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // * upper Part
        for (int i = 1; i <= 5; i++) {
            // Left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for (int space = 2 * (n - i); space >= 1; space--) {
                System.out.print("  ");
            }
            // Right triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        //* Lower part
        for (int i = 4; i >= 1; i--) {
            // Left triangle
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            // Spaces
            for (int space = 1; space <= 2 * (n - i); space++) {
                System.out.print("  ");
            }
            // Right triangle
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
