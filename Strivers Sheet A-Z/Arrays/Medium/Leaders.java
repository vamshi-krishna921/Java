import java.util.ArrayList;
import java.util.Scanner;
public class Leaders {
    static int[] leadersInArray(int[] arr){
        //! Brute is using 2 for loops

        //TODO Optimal soln
        ArrayList<Integer> list = new ArrayList<>();
        int maxElem = arr[arr.length-1];
        list.add(maxElem);
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] > maxElem) {
                list.add(arr[i]);
                maxElem = arr[i];
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
         return result;
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
        int result[] = leadersInArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
