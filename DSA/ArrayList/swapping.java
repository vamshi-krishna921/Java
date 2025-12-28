import java.util.ArrayList;
import java.util.Scanner;

public class swapping {
    static void swapNums(ArrayList<Integer> nums){
        int start = 0;
        int end = nums.size()-1;
        while (start<end) {
            int temp = nums.get(end);
            nums.set(end,nums.get(start));
            nums.set(start, temp);
            start++;
            end--;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements : ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        System.out.print("Before swapping :" + nums);
        swapNums(nums);
        System.out.println();
        System.out.print("After swapping : " + nums);
    }
}
