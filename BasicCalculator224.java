import java.util.Stack;

public class BasicCalculator224 {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0, sign = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int right = c - '0';
                while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))){
                    i++;
                    right = right * 10 + s.charAt(i) - '0';
                }
                result = result + right * sign;
            }else if(c == '+'){sign = 1;
            }else if(c == '-'){sign = -1;
            }else if(c == '('){
                stack.push(result);
                result = 0;
                stack.push(sign);
                sign = 1;
            }else if(c == ')'){
                int formerSign = stack.pop();
                int formerResult = stack.pop();
                result = formerResult + formerSign * result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}
