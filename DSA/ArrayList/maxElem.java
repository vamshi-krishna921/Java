import java.util.ArrayList;
import java.util.Scanner;

public class maxElem {
    static int findMaxElem(ArrayList<Integer> nums){
        int largesNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            largesNum = Math.max(largesNum, nums.get(i));
        }
        return largesNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elems : ");
        int size = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.print("Enter the elems : ");
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        System.out.print("The max elem in ArrayList is : " + findMaxElem(nums));
    }
}