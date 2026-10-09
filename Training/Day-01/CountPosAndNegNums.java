public class CountPosAndNegNums {
    public static void main(String[] args) {
        int[] numbers = { 5, -2, 9, -1, 7, -3, 0, 0};
        int positiveCount = 0, negativeCount = 0, zeros = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }else{
                zeros++;
            }
        }
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeros);
    }
}
