public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(l1 != null || l2 != null){
            int x, y;
            if(l1 == null){x = 0;
            }else{x = l1.val;}
            if(l2 == null){y = 0;
            }else{y = l2.val;}
            int result = x + y + temp;
            temp = result / 10;
            cur.next = new ListNode(result % 10);
            cur = cur.next;
            if(l1 != null){l1 = l1.next;}
            if(l2 != null){l2 = l2.next;}
        }
        if(temp == 1){
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }
}
