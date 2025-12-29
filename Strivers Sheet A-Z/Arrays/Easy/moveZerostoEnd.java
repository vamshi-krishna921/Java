import java.util.ArrayList;
import java.util.Scanner;

public class moveZerostoEnd {
    static int[] moveZeros(int arr[]) {
        // ! Brute force
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != 0) {
        // list.add(arr[i]);
        // }
        // }
        // int n = list.size() - 1;
        // for (int i = n; i < arr.length; i++) {
        // list.add(0);
        // }
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = list.get(i);
        // }

        // TODO Optimal soln using two pointers
        if (arr.length < 1) {
            return arr;
        }
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j==-1) {
            return arr;
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
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
        moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
