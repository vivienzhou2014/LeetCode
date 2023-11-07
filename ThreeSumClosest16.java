import java.util.Arrays;

public class ThreeSumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[n-1]+nums[n-2]+nums[n-3];
        for(int i = 0; i < n; i++){
            int low = i + 1, high = n - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
                if(sum < target){
                    low++;
                }else if(sum > target){
                    high--;
                }else{
                    return sum;
                }
            }
        }
        return result;
    }
}
