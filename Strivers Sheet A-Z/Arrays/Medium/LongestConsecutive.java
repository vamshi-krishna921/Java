import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutive {
    // static boolean linearSearch(int elem, int[] arr){
    // for (int num : arr) {
    // if (num == elem) {
    // return true;
    // }
    // }
    // return false;
    // }

    static int LongConsutive(int[] arr) {
        int maxLen = 0;
        // for (int i = 0; i < arr.length; i++) {
        // int elem = arr[i];
        // int count = 1;
        // while (linearSearch(elem+1, arr)) {
        // elem++;
        // count++;
        // }
        // maxLen = Math.max(maxLen, count);
        // }
        //TODO Optimal using HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!set.contains(num - 1)) {
                int count = 1;
                int elem = num;
                while (set.contains(elem + 1)) {
                    elem++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
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
        System.out.print("The Longest consecutive is " + LongConsutive(arr));
    }
}
