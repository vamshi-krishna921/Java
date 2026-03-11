public class DeleteAllOccurances {
    if(head == null || (head.data != x && head.next == null))
            return head;
        while(head != null && head.data == x){
            head = head.next;
        }
        if(head == null) return null;
        head.prev = null;
        Node temp = head;
        while(temp != null){
            if(temp.data == x){
                Node search = temp;
                while(search != null && search.data == x){
                    search = search.next;
                }
                if(temp.prev != null)
                    temp.prev.next = search;
                if(search != null)
                    search.prev = temp.prev;
            }
                temp = temp.next;
        }
        return head;
}
