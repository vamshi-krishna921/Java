import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
    static void intersection(int[] arr1, int[] arr2){
        int i = 0, j =0 ;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            }else if (arr2[j] > arr1[i]) {
                j++;
            }else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1 : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements: ");
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2 : ");
        int size1 = sc.nextInt();
        System.out.print("Enter the " + size1 + " elements: ");
        int[] arr2 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr2[i] = sc.nextInt();
        }
        intersection(arr1, arr2);
    }
}
