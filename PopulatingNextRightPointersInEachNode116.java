public class PopulatingNextRightPointersInEachNode116 {
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

    class Solution {
        public Node connect1(Node root) {
            if(root == null){
                return root;
            }
            Node veryLeft = root;
            while(veryLeft.left != null){
                Node head = veryLeft;
                while(head != null) {
                    head.left.next = head.right;

                    if (head.next != null) {
                        head.right.next = head.next.left;
                    }
                    head = head.next;
                }
                veryLeft = veryLeft.left;
            }

            return root;
        }

        public Node connect2(Node root) {
            if(root == null){
                return root;
            }

            if(root.left != null){
                root.left.next = root.right;
            }

            if(root.next != null && root.right != null){
                root.right.next = root.next.left;
            }
            connect2(root.left);
            connect2(root.right);
            return root;

        }


    }
}
