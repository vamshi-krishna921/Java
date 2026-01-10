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
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // if (map.get(arr[i]) > arr.length / 3) {
        // ans.add(arr[i]);
        // }
        // }

        // TODO Optimal using the intution of n/2
        int count1 = 0, count2 = 0;
        int elem1 = 0, elem2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && elem2 != arr[i]) {
                count1 = 1;
                elem1 = arr[i];
            }else if (count2 == 0 && elem1 != arr[i]) {
                count2 = 1;
                elem2 = arr[i];
            }else if (arr[i] == elem1) {
                count1++;
            }else if (arr[i] == elem2) {
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;count2 = 0;
        for (int elem : arr) {
            if (elem1 == elem) {
                count1++;
            }
            if (elem2 == elem) {
                count2++;
            }
        }
        if (count1 > arr.length/3) {
            ans.add(elem1);
        }
        if (count2 > arr.length/3) {
            ans.add(elem2);
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
