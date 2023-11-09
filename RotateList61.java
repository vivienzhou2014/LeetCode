public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next!= null){
            tail = tail.next;
            len++;
        }
        tail.next = head;
        ListNode pre = head;
        k = len - k % len - 1;
        while(k > 0){
            pre = pre.next;
            k--;
        }
        ListNode cur = pre.next;
        pre.next = null;
        return cur;
    }
    public ListNode rotateRight1(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return head;
        int len = 1;
        ListNode last = head;
        while(last.next!= null){
            last = last.next;
            len++;
        }//算链表长度
        last.next = head;//把链表搞成环
        ListNode tail = head;
        k = len - k % len - 1;//从尾巴数rotate一次往前跳一个，%是把k限制在长度之内
        while(k > 0){
            tail = tail.next;
            k--;
        }//从头实现那个尾巴开始跳的过程
        ListNode cur = tail.next;//这是新头
        tail.next = null;//这是新尾，跟新头断开
        return cur;
    }
}
