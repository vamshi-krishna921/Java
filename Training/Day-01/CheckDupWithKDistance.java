import java.util.HashMap;

public class CheckDupWithKDistance {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 1, 4, 5, 2 };
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (map.containsKey(num) && (i - map.get(num) == k)) {
                System.out.println("True");
                return;
            }
            map.put(num, i);
        }
        System.out.println("False");
    }
}
