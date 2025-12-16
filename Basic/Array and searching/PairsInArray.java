import java.util.Scanner;

public class PairsInArray {
    static void pairs(int []arr){
        // int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                // totalPairs++;
            }
            System.out.println();
        }
        int totalPairs = arr.length * (arr.length -1)/2;
        System.out.print("The total pairs are " + totalPairs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        pairs(arr);
    }
}
