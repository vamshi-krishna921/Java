public class Zigzag {
     public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode cur = slow.next;
        slow.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode left = head;
        ListNode right = prev;
        while(left!=null && right != null){
            ListNode ln = left.next;
            ListNode rn = right.next;
            left.next = right;
            right.next = ln;
            left = ln;
            right = rn;
        }
    }
}
