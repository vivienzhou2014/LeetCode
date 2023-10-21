import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> results = new Stack<>();
        int rightNum;
        int leftNum;
        int result;
        for(String token : tokens){
            if(token.equals("+")){
                rightNum = results.pop();
                leftNum = results.pop();
                result = leftNum + rightNum;
            }else if(token.equals("-")){
                rightNum = results.pop();
                leftNum = results.pop();
                result = leftNum - rightNum;
            }else if(token.equals("*")){
                rightNum = results.pop();
                leftNum = results.pop();
                result = leftNum * rightNum;
            }else if(token.equals("/")){
                rightNum = results.pop();
                leftNum = results.pop();
                result = leftNum / rightNum;
            }else{
                result = Integer.valueOf(token);
            }
            results.push(result);
        }
        return results.pop();
    }
}
