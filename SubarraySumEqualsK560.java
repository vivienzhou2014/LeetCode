import java.util.HashMap;

public class SubarraySumEqualsK560 {
    public static int subarraySum(int[] nums, int k) {
        int result = 0;
        int pre = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            pre += nums[i];
            if(map.containsKey(pre-k)){
                result += map.get(pre-k);
            }
            map.put(pre, map.getOrDefault(pre,0)+1);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};
        System.out.println(subarraySum(nums, 0));
    }
}
