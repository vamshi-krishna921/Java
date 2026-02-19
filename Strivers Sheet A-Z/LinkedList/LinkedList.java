import java.util.Scanner;

public class LinkedList {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ? Head and tail
    public static node head;
    public static node tail;

    // *Add node one after another (Sequence)
    public void addNode(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
 
    }

    // * Printing list
    public void printList() {
        if (head == null) {
            System.out.print("No nodes found.");
        } else {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (true) {
            System.out.println("1. Add elem ");
            System.out.println("2. Print list");
            System.out.println("4. Exit");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    ll.addNode(val);
                    break;
                case 2:
                    ll.printList();
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}
