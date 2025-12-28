import java.util.ArrayList;
import java.util.Scanner;

public class printReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements : ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        for (int i = nums.size()-1; i >= 0; i--) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
