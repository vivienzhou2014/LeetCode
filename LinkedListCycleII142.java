import java.util.HashSet;

public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        HashSet<ListNode> visited = new HashSet<>();
        ListNode cur = head;
        while(cur != null){
            if(!visited.contains(cur)){
                visited.add(cur);
                cur = cur.next;
            }else{
                return cur;
            }
        }
        return null;
    }
    public ListNode detectCycle1(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head.next, fast = head.next.next;
        while(fast != null && fast.next != null && slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null || fast.next == null) return null;
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public ListNode detectCycle2(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
