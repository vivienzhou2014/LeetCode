import java.util.HashMap;

public class ContainsDuplicateII219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(pos.containsKey(nums[i]) && i-pos.get(nums[i])<=k){
                return true;
            }else{pos.put(nums[i],i);}
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
}
