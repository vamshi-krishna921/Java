import java.util.Scanner;

public class containerMostWater {
    static int mostWater(int arr[]) {

        // ! Brute force
        int water = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // int width = j - i;
        // int height = Math.min(arr[i], arr[j]);
        // int waterStored = height * width;
        // water = Math.max(waterStored, water);
        // }
        // }
        // return water;

        // TODO Optimal sol using two pointers
        int left = 0;
        int right = arr.length - 1;
        while(left<right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int waterStored = height * width;
            water = Math.max(waterStored, water);
            if (arr[left] < arr[right]) {
                left++;
            }else{
                right--;
            }
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
        int result = mostWater(arr);
        System.out.println(result);
    }
}
