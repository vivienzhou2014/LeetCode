public class ReorderList143 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public void reorderList(ListNode head) {
            if(head == null) return;
            ListNode slow = head, fast = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode pre = null, cur = slow, temp;
            while(cur != null){
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            ListNode one = head, two = pre;
            while(two.next!=null){
                temp = one.next;
                one.next = two;
                one = temp;
                temp = two.next;
                two.next = one;
                two = temp;
            }
        }
    }
}
