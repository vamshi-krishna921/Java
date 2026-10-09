public class SumOfElemsAtEvenIdx {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 7 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }
        System.out.println("The sum of elements at even indices is: " + sum);
    }
}
