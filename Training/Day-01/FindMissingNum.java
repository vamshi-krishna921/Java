public class FindMissingNum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5, 6, 0 , 4};
        int n = numbers.length;
        int misNum = 0;
        for (int num : numbers) {
            misNum ^= num;
        }
         for (int i = 1; i <= n; i++) {
            misNum ^= i;
        }
        System.out.println("The missing number is: " + misNum);
    }
}
