import java.util.Scanner;

public class mediumInSorted {

    static int findMedium(int arr1[], int arr2[]) {
        int merArr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merArr[index] = arr1[i];
                index++;
                i++;
            } else {
                merArr[index] = arr2[j];
                index++;
                j++;
            }
        }
        while (i < arr1.length) {
            merArr[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length) {
            merArr[index] = arr2[j];
            index++;
            j++;
        }
        if (merArr.length % 2 != 0) {
            return merArr[merArr.length / 2];
        } else {
            return (merArr[(merArr.length / 2) - 1] + merArr[merArr.length / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1:  ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2:  ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("The medium is : " + findMedium(arr1, arr2));
    }
}
