import java.util.Stack;

public class MinStack155 {
    class MinStack {
        Stack<Integer> normal;
        Stack<Integer> extra;
        public MinStack() {
            normal = new Stack<>();
            extra = new Stack<>();
        }

        public void push(int val) {
            normal.push(val);
            if(!extra.isEmpty()){
                if(val <= extra.peek()){
                    extra.push(val);
                }
            }else{
                extra.push(val);
            }
        }

        public void pop() {
            int pop = normal.pop();
            if(extra.peek() == pop){
                extra.pop();
            }
        }

        public int top() {
            return normal.peek();
        }

        public int getMin() {
            return extra.peek();
        }
    }


//  Your MinStack object will be instantiated and called as such:
  /*MinStack obj = new MinStack();
  obj.push(val);
  obj.pop();
  int param_3 = obj.top();
  int param_4 = obj.getMin();*/
}
