public class CopyingArray {

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5 };
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.print("Copied array: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        // * using Arrays.copyOf() */
        int[] copy2 = java.util.Arrays.copyOf(original, original.length);
        System.out.println();
        for (int i = 0; i < copy2.length; i++) {
            System.out.print(copy2[i] + " ");
        }

        //* using System.arraycopy() */
        int[] copy3 = new int[original.length];
        System.out.println();
        System.arraycopy(original, 0, copy3, 0, original.length);
        for (int i = 0; i < copy3.length; i++) {
            System.out.print(copy3[i] + " ");
        }
    }
}