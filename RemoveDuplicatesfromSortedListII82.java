public class RemoveDuplicatesfromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next!= null && cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                int value = cur.next.val;
                while(cur.next != null && cur.next.val == value){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
