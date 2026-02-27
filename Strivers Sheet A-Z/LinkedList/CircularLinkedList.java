import java.util.Scanner;

public class CircularLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // *Add elems (sequence)
    public void addElem(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // * Print list
    public void printList() {
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();
        while (true) {
            System.out.println("1. Add elem");
            System.out.println("2. Print list");
            System.out.println("3. Exit");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter the value: ");
                    int val = sc.nextInt();
                    cll.addElem(val);
                    break;
                case 2:
                    cll.printList();
                    break;
                case 3:
                    System.exit(0);

                default:
                    break;
            }
        }
    }
}
