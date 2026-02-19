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

    // * First order sequence
    public void firstOrder(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
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
            System.out.println("null");
        }

    }

    // * Add first
    public static void addFirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // * Add Last
    public static void addLast(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // * Add at position
    public static void addAtPos(int pos, int data) {
        node newNode = new node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }
            return;
        }
        node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (true) {
            System.out.println("1. Add elem ");
            System.out.println("2. Print list");
            System.out.println("3. Add elem first order");
            System.out.println("4. Exit");
            System.out.println("5. Add at first");
            System.out.println("6. Add elem at last");

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    ll.addNode(val);
                    break;
                case 2:
                    ll.printList();
                    break;
                case 3:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    ll.firstOrder(val);
                    break;
                case 4:
                    System.exit(0);
                case 5:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    ll.addFirst(val);
                    break;
                case 6:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    ll.addLast(val);
                    break;
                case 7:
                    System.out.print("Enter the position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter the elem: ");
                    val = sc.nextInt();
                    ll.addAtPos(pos, val);
                    break;
                default:
                    break;
            }
        }

    }
}
