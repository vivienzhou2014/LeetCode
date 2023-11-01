import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> max = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length-1; i >= 0; i--){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){stack.pop();}
            max.put(nums2[i], stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){result[i] = max.get(nums1[i]);}
        return result;
    }

}
