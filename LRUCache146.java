import java.util.HashMap;

public class LRUCache146 {
    class LRUCache {
        class Node{
            private int val;
            private Node pre, next;
            private Node(int val){
                this.val = val;
            }
        }
        HashMap<Integer, Object[]> map;
        Node head, tail;
        int capacity;
        public LRUCache(int capacity) {
            map = new HashMap<>();
            head = new Node(-1);
            tail = new Node(-1);
            head.next = tail;
            tail.pre = head;
            this.capacity = capacity;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                Node x = (Node)map.get(key)[0];
                Node preNode = x.pre;//start to delete x
                Node nextNode = x.next;
                preNode.next = nextNode;
                nextNode.pre = preNode;//complete deletion
                Node temp = head.next;//insert x from head
                head.next = x;
                temp.pre = x;
                x.pre = head;
                x.next = temp;//complete insertion
                return (Integer)map.get(key)[1];
            }else{
                return -1;
            }
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){//update Node if exist
                Node x = (Node)map.get(key)[0];
                Node preNode = x.pre;//start to delete x
                Node nextNode = x.next;
                preNode.next = nextNode;
                nextNode.pre = preNode;//complete deletion
                Node temp = head.next;//insert x from head
                head.next = x;
                temp.pre = x;
                x.pre = head;
                x.next = temp;//complete insertion
                map.put(key, new Object[]{x, value});
                return;
            }
            if(map.size() == capacity){//delete from tail if it's about to be full
                Node x = tail.pre;//delete node
                Node xPre = x.pre;
                xPre.next = tail;
                tail.pre = xPre;//node deleted
                map.remove((Integer)x.val);//delete key
            }
            Node x = new Node(key);
            Node temp = head.next;//insert x from head
            head.next = x;
            temp.pre = x;
            x.pre = head;
            x.next = temp;//complete insertion
            map.put(key, new Object[]{x, value});
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
