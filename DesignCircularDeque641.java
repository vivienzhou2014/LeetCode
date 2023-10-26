public class DesignCircularDeque641 {
    class MyCircularDeque {
        int[] array;
        int front;
        int rear;
        int capacity;
        public MyCircularDeque(int k) {
            front = 0;
            rear = 0;
            capacity = k + 1;
            array = new int[capacity];
        }
        public boolean insertFront(int value) {
            if(isFull()){return false;}
            front = (front - 1 + capacity) % capacity;
            array[front] = value;
            return true;
        }
        public boolean insertLast(int value) {
            if(isFull()){return false;}
            array[rear] = value;
            rear = (rear + 1) % capacity;
            return true;
        }
        public boolean deleteFront() {
            if(isEmpty()){return false;}
            front = (front + 1) % capacity;
            return true;
        }
        public boolean deleteLast() {
            if(isEmpty()){return false;}
            rear = (rear - 1 + capacity) % capacity;
            return true;
        }
        public int getFront() {
            if(isEmpty()){return -1;}
            return array[front];
        }
        public int getRear() {
            if(isEmpty()){return -1;}
            int r = (rear - 1 + capacity) % capacity;
            return array[r];
        }
        public boolean isEmpty() {return front == rear;}
        public boolean isFull() {return (rear + 1)%capacity == front;}
    }

}
