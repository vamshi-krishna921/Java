import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fourSum {
    static ArrayList<ArrayList<Integer>> foursum(int arr[], int target) {
        Set<ArrayList<Integer>> newSet = new HashSet<>();

        // ! Brute force using set and list
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // for (int k = j + 1; k < arr.length; k++) {
        // for (int l = k + 1; l < arr.length; l++) {
        // if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
        // ArrayList<Integer> tempList = new ArrayList<>();
        // tempList.add(arr[i]);
        // tempList.add(arr[j]);
        // tempList.add(arr[k]);
        // tempList.add(arr[l]);
        // Collections.sort(tempList);
        // newSet.add(tempList);
        // }
        // }
        // }
        // }
        // }

        // * Better soln
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // Set<Long> tempSet = new HashSet<>();
        // for (int k = j + 1; k < arr.length; k++) {
        // long sum = (long) arr[i] + arr[j] + arr[k];
        // long fourth = (long) target - sum;
        // if (tempSet.contains(fourth)) {
        // ArrayList<Integer> tempList = new ArrayList<>();
        // tempList.add(arr[i]);
        // tempList.add(arr[j]);
        // tempList.add(arr[k]);
        // tempList.add((int) fourth);
        // Collections.sort(tempList);
        // newSet.add(tempList);
        // }
        // tempSet.add((long) arr[k]);
        // }
        // }
        // }

        // TODO 2 pointers
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        ArrayList<Integer> tempList = new ArrayList<>();
                        tempList.add(arr[i]);
                        tempList.add(arr[j]);
                        tempList.add(arr[k]);
                        tempList.add(arr[l]);
                        newSet.add(tempList);
                        while (k < l && arr[k] == arr[k + 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l - 1]) {
                            l--;
                        }
                        k++;
                        l--;
                    }else if (sum<target) {
                        k++;
                    }else{
                        l--;
                    }
                }

            }
        }

        return new ArrayList<>(newSet);
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
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        ArrayList<ArrayList<Integer>> result = foursum(arr, target);
        System.out.println(result);
    }
}
