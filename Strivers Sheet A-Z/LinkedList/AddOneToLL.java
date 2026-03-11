class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class AddOneToLL {
    static Node reverseList(Node head) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    static Node addOne(Node head) {
        head = reverseList(head);
        Node temp = head;
        int carry = 1;
        while (temp != null && carry != 0) {
            temp.data += carry;
            if (temp.data == 10) {
                temp.data = 0;
                carry = 1;
            } else {
                carry = 0;
            }
            if (temp.next == null && carry == 1) {
                temp.next = new Node(1);
                carry = 0;
            }
            temp = temp.next;
        }
        return reverseList(head);
    }

    public static void main(String[] args) {

        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head = addOne(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}