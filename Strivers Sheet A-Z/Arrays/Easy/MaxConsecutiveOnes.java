import java.util.Scanner;

public class MaxConsecutiveOnes {
    static int maxConsOnes(int[] arr){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count=0;
            }
        }
        return maxCount;
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
        System.out.print("The maximum consecutive 1's is " + maxConsOnes(arr));
    }
}