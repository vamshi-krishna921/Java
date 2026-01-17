import java.util.Scanner;

public class trappingRainWater {
    static int waterStored(int[] arr) {
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            water += waterLevel - arr[i];
        }
        return water;

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
        int result = waterStored(arr);
        System.out.print("The water stored is " + result);
    }
}
