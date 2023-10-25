import java.util.Stack;

public class LargestRectangleinHistogram84 {
    public int largestRectangleArea(int[] heights) {
        int[] newHeights = new int[heights.length + 2];
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            newHeights[i + 1] = heights[i];
        }
        for(int i = 0; i < newHeights.length; i++){
            while(!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]){
                int h = newHeights[stack.pop()];
                int l = stack.peek();
                int r = i;
                int w = r - l - 1;
                result = Math.max(result, h*w);
            }
            stack.push(i);
        }
        return result;
    }

}
