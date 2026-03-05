public class InsertNodehead {
    private static class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // * Insert nodes
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.left = tail;
        tail.right = newNode;
        tail = newNode;
    }

    // * Display dll
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.right;
        }
        System.out.print("null");
        System.out.println();
    }

    // * Insert node before head
    public void addBeforeHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.right = head;
        head.left = newNode;
        head = newNode;
    }

    // * Delete head
    public void deleteHead() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        head = head.right;
        head.left = null;
        temp.right = null;
    }

    public static void main(String[] args) {
        InsertNodehead n = new InsertNodehead();
        n.addNode(1);
        n.addNode(2);
        n.addNode(2);
        n.display();
        n.addBeforeHead(0);
        n.display();
        System.out.println("After deleting head");
        n.deleteHead();
        n.display();
    }
}
