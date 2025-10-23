public class InvertedNumbersPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int j = 9; j >= (2*i) - 1; j--) {
                int numPrint = j - (i - 1) * 2;
                System.out.print(numPrint);
                numPrint--;
            }
            System.out.println();
        }
    }
}
