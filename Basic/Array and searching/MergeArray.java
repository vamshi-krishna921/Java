import java.util.Scanner;

public class MergeArray {

    static int[] mergeArray(int arr1[], int arr2[]){
        int[] merArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merArray[i] = arr1[i];
        }
         for (int i = 0; i < arr2.length; i++) {
            merArray[i + arr1.length] = arr2[i];
        }
        return merArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr1 : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.print("Enter the " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of arr2 : ");
        int size1 = sc.nextInt();
        int[] arr2 = new int[size1];
        System.out.print("Enter the " + size + " elements : ");
        for (int i = 0; i < size1; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] mergedArray = mergeArray(arr1, arr2);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
