import java.util.Scanner;

public class buyToSellStock {
    static int maxProfit(int[] arr){
        int tempProfit = 0;
        int maxPro = 0;
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tempProfit = arr[i] - minElem;
            maxPro = Math.max(maxPro, tempProfit);
            minElem = Math.min(minElem, arr[i]);
        }
        return maxPro;
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
        System.out.print("The max profit is : " + maxProfit(arr));
    }
}
