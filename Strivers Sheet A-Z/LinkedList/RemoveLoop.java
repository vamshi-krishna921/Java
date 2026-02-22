public class RemoveLoop {
    public void removeCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean loopFound = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                loopFound = true;
                break;
            }
        }
        if (loopFound == false) {
            return;
        }
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        slow = head;
        ListNode prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
}
