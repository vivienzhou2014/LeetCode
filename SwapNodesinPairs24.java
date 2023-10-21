public class SwapNodesinPairs24 {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode pre = dummy;
            ListNode cur = head;
            while(cur != null){
                //swap
                if(cur.next != null){
                    pre.next = cur.next;
                    cur.next = cur.next.next;
                    pre.next.next = cur;}
                //move
                pre = cur;
                cur = cur.next;
            }
            return dummy.next;
        }
    }
}
