import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElem {
    static ArrayList<Integer> nThreeMajorityElem(int[] arr, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        // ! Brute force
        // for (int i = 0; i < arr.length; i++) {
        // int count = 1;
        // for (int j = i + 1; j < arr.length - 1; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // i++;
        // }
        // }
        // if (count > size / 3) {
        // ans.add(arr[i]);
        // }
        // }

        // * Better soln using the hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > arr.length / 3) {
                ans.add(arr[i]);
            }
        } 

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elems : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = nThreeMajorityElem(arr, size);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
