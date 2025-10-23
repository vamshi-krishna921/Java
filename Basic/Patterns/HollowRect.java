public class HollowRect {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print((i == 1 || i == 3 || j == 1 || j == 7) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
