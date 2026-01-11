import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThreeSum {

    static ArrayList<ArrayList<Integer>> sumThree(int[] arr, int size) {
        Set<ArrayList<Integer>> newSet = new HashSet<>();
        // ! Brute force using set
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // for (int k = j + 1; k < arr.length; k++) {
        // if (arr[i] + arr[j] + arr[k] == 0) {
        // ArrayList<Integer> temp = new ArrayList<>();
        // temp.add(arr[i]);
        // temp.add(arr[j]);
        // temp.add(arr[k]);
        // Collections.sort(temp);
        // newSet.add(temp);
        // }
        // }
        // }
        // }

        // * Better soln using set
        // Set<Integer> tempSet = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        // tempSet.clear();
        // for (int j = i + 1; j < arr.length; j++) {
        // int nextElem = -(arr[i] + arr[j]);
        // if (tempSet.contains(nextElem)) {
        // ArrayList<Integer> tempList = new ArrayList<>();
        // tempList.add(arr[i]);
        // tempList.add(arr[j]);
        // tempList.add(nextElem);
        // Collections.sort(tempList);
        // newSet.add(tempList);
        // } else {
        // tempSet.add(arr[j]);
        // }

        // }
        // }

        // TODO Optimal solution using 3 pointer approach
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    newSet.add(temp);
                    while (j < k && arr[j] == arr[j+1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }

        }
        return new ArrayList<>(newSet);
        // return list;
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
        ArrayList<ArrayList<Integer>> result = sumThree(arr, size);
        System.out.println(result);
    }
}
