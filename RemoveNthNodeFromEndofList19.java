public class RemoveNthNodeFromEndofList19 {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode preHead = new ListNode(-1);
            preHead.next = head;
            ListNode cur = preHead;
            ListNode pre = preHead;
            for(int i = 0; i < n; i++){
                cur = cur.next;
            }
            while(cur.next != null){
                pre = pre.next;
                cur = cur.next;
            }
            pre.next = pre.next.next;
            return preHead.next;
        }
    }
}
