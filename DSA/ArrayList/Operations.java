import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // * add (adding an elem at the end)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.print(list);

        // * get(index) to access elems using index
        // System.out.println(list.get(2));

        // * remove(index) to delete an elem using index
        // list.remove(2);
        // System.out.println(list);

        // * set() to modify the elem at that index
        // list.set(2, 3);
        // System.out.println(list);

        // * contains(elem) to find is the elem present in list/not
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(5));

        // * size() to find the size of array list
        // System.out.println(list.size());

        // * add(index, elem)
        // list.add(1, 5);
        // System.out.println(list);

        // * remove() using value
        list.remove(Integer.valueOf(3));
        System.out.println(list);
    }

}