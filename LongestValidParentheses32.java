import java.util.Stack;

public class LongestValidParentheses32 {
    public int longestValidParentheses(String s) {
        int result = 0, start = 0;
        Stack<Integer> location = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                location.add(i);
            }else{
                if(location.isEmpty()){
                    start = i + 1;
                }else{
                    location.pop();
                    if(location.isEmpty()){
                        int len = i - start + 1;
                        result = result >len? result:len;
                    }else{
                        result = Math.max(result, i-location.peek());}
                }
            }

        }
        return result;
    }

}
