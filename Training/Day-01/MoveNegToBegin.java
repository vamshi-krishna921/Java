public class MoveNegToBegin {
    public static void main(String[] args) {
        int[] numbers = { 5, -2, 9, -1, 7, -3, 0, -15, 9};
        int negIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                int temp = numbers[negIndex];
                numbers[negIndex] = numbers[i];
                numbers[i] = temp;
                negIndex++;
            }
        }
        System.out.print("Moving negatives to the beginning: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
