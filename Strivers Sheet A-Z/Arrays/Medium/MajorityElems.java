import java.util.HashMap;
import java.util.Scanner;

public class MajorityElems {
    static int majElem(int[] arr) {
        // ! Brute is using 2 loops
        // * Better approach is using the hashing(HashMap)
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        // }
        // for (int key : map.keySet()) {
        // if (map.get(key)>arr.length/2) {
        // return key;
        // }
        // }

        // TODO Moore's voting algorithms
        int count = 0, curElem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                curElem = arr[i];
            } else if (curElem == arr[i]) {
                count++;
            } else {
                count--;
            }

        }
        count = 0;
        for (int elem : arr) {
            if (curElem == elem) {
                count++;
            }
        }
        return (count>arr.length/2) ? curElem : -1;
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
        int result = majElem(arr);
        if (result != -1) {
            System.out.print(result);
        } else {
            System.out.println(result);
        }
    }
}
