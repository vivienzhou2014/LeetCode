

import java.util.LinkedList;

public class isBST {
    public static class Node{
        public Node left;
        public Node right;
        public int value;
        public Node(int data){
            this.value = data;
        }

    }
    public static boolean isBST(Node head){
        if(head == null){
            return true;
        }
        LinkedList<Node> inOrderList = new LinkedList<>();
        process(head, inOrderList);
        int i = Integer.MIN_VALUE;
        for (Node node: inOrderList) {
            if(i >= node.value){
                return false;
            }else{
                i = node.value;
            }
        }
        return true;
    }
    public static void process(Node head, LinkedList<Node> inOrderlist){
        if(head == null){
            return;
        }
        process(head.left, inOrderlist);
        inOrderlist.add(head);
        process(head.right, inOrderlist);
    }
}
