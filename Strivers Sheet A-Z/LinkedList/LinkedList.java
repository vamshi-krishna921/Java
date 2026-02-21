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
    public static int size;

    // *Add node one after another (Sequence)
    public void addNode(int data) {
        node newNode = new node(data);
        // size++;
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
        size++;
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
        size++;
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
        size++;
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

    // ? Deletion
    // * delete 1st node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        node temp = head;
        head = head.next;
        temp.next = null;
    }

    // * Delete last node
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    // * Delete node at any position
    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        if (pos == 1) {
            if (head == tail) {
                head = tail = null;
            } else {
                node temp = head;
                head = head.next;
                temp.next = null;
            }
            return;
        }
        int count = 1;
        node temp = head;
        node prev = temp;
        while (count < pos && temp != null) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        prev.next = temp.next;
        if (temp == tail) {
            tail = prev;
        }
        temp.next = null;
    }

    // * Search in linkedList(iterative)
    public static int iterativeSearch(int key) {
        node temp = head;
        int pos = 0;
        if (head.data == key) {
            return pos;
        }
        while (temp != null) {
            if (temp.data == key) {
                return pos;
            } else {
                temp = temp.next;
                pos++;
            }
        }
        return -1;
    }

    // * Reverse a linkedlist
    public static void revList() {
        node prev = null;
        node cur = tail = head;
        node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
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
            System.out.println("7. Ad elem at any position");
            System.out.println("Deletion");
            System.out.println("8. Delete first node");
            System.out.println("9. Delete last node");
            System.out.println("10. Delete node at any position");
            System.out.println("11. Search in linkedList");
            System.out.println("12. Reverse linkedList");

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
                case 8:
                    ll.deleteFirst();
                    break;
                case 9:
                    ll.deleteLast();
                    break;
                case 10:
                    System.out.print("Enter the pos: ");
                    pos = sc.nextInt();
                    ll.deleteAtPos(pos);
                    break;
                case 11:
                    System.out.print("Enter the key: ");
                    int key = sc.nextInt();
                    System.out.println("The elem is found at: " + ll.iterativeSearch(key));
                    break;
                case 12:
                    ll.revList();
                    break;
                default:
                    break;
            }
        }

    }
}
