public class MostFreqElem {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 7, 2, 5, 9, 1, 2};
        int[] count = new int[10];
        for (int num : numbers) {
            count[num]++;
        }
        int mostFreqElem = -1;
        int maxCount = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFreqElem = i;
            }
        }
        System.out.println("The most frequent element is: " + mostFreqElem);
    }
}
