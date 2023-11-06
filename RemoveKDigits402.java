import java.util.Stack;

public class RemoveKDigits402 {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            if(c == '0' && stack.isEmpty()) continue;
            stack.push(c);
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()) return "0";
        for(char c :stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
