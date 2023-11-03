import java.util.PriorityQueue;

public class MergekSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2)->o1.val-o2.val);
        for(ListNode head: lists){if(head != null){pq.offer(head);}}
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(!pq.isEmpty()){
            ListNode next = pq.poll();
            cur.next = next;
            cur = next;
            if(cur.next != null){pq.offer(cur.next);}
        }
        return dummy.next;
    }
}
