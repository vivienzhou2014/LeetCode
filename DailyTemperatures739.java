import java.util.Stack;

public class DailyTemperatures739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] days = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            days[i] = stack.isEmpty()? 0: (stack.peek() - i);
            stack.push(i);
        }
        return days;
    }

}
