public class IntersectionofTwoLinkedLists160 {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null){
                return null;
            }
            ListNode pointA = headA;
            ListNode pointB = headB;
            while(pointA != pointB){
                if(pointA == null){
                    pointA = headB;
                }else{
                    pointA = pointA.next;
                }
                if(pointB == null){
                    pointB = headA;
                }else{
                    pointB = pointB.next;
                }
            }
            return pointA;
        }
    }
}
