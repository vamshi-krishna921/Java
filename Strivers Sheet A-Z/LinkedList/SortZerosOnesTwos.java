import java.util.Scanner;

public class SortZerosOnesTwos {
    public void sortList(LinkedList ll) {
        int zero = 0, one = 0, two = 0;
        LinkedList.node temp = LinkedList.head;
        while (temp != null) {
            if (temp.data == 0)
                zero++;
            else if (temp.data == 1)
                one++;
            else if (temp.data == 2)
                two++;
            temp = temp.next;
        }
        temp = LinkedList.head;
        while (zero > 0) {
            temp.data = 0;
            temp = temp.next;
            zero--;
        }
        while (one > 0) {
            temp.data = 1;
            temp = temp.next;
            one--;
        }
        while (two > 0) {
            temp.data = 2;
            temp = temp.next;
            two--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        SortZerosOnesTwos sorter = new SortZerosOnesTwos();
        while (true) {
            System.out.println("1. Add value ");
            System.out.println("2. Print value ");
            System.out.println("3. Sort ");
            System.out.println("4. Exit ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter the value: ");
                    int val = sc.nextInt();
                    ll.addNode(val);
                    break;
                case 2:
                    ll.printList();
                    break;
                case 3:
                    sorter.sortList(ll);
                    System.out.println("List Sorted");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}