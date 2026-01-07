import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraySumK {
    static int subSumArray(int[] arr,int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
            if (map.containsKey(sum-k)) {
                count = count + map.get(sum-k);
            }
            map.putIfAbsent(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the " + size + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum : ");
        int sum = sc.nextInt();
        System.out.print("The max index is " + subSumArray(arr,sum));
    }
}
