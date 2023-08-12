public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            //ListNode temp = list1.next;
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            //ListNode temp = list2.next;
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
