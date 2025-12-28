import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sorting {
    static void sortingNums(ArrayList<Integer> numList) {

        Collections.sort(numList);
        System.out.print("After sorting ascending order : " + numList);
        Collections.sort(numList, Collections.reverseOrder());
        System.out.println();
        System.out.print("Reverse order : " + numList);
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
        System.out.print("Before sorting :" + nums);
        sortingNums(nums);
    }

}
