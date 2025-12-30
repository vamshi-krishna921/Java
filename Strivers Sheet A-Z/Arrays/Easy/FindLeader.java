import java.util.ArrayList;
import java.util.Scanner;

public class FindLeader {
    static void leaders(int[] arr) {
        // ! Brute force
        ArrayList<Integer> list = new ArrayList<>();
        boolean leader = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    leader = true;
                } else {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length - 1]);
        System.out.print("The leaders are ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        leaders(arr);
    }
}
