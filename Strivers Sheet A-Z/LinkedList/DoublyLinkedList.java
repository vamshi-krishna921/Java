import java.util.Scanner;

public class DoublyLinkedList {

    private static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // * Add element at end
    public void addElem(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // * Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // * Display backward
    public void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // * Reverse Doubly LinkedList
    public void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        // Swap head and tail
        if (temp != null) {
            tail = head;
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList ddl = new DoublyLinkedList();
        while (true) {
            System.out.println("1. Add elem");
            System.out.println("2. Display Forward");
            System.out.println("3. Display Backward");
            System.out.println("4. Exit");
            System.out.println("5. Reverse the DoublyLinkedList");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    ddl.addElem(val);
                    break;

                case 2:
                    ddl.displayForward();
                    break;

                case 3:
                    ddl.displayBackward();
                    break;

                case 4:
                    System.exit(0);

                case 5:
                    ddl.reverse();
                    break;
                default:
                    break;
            }
        }
    }
}