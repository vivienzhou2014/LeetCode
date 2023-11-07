import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                return result;
            }else if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }else{
                int low = i + 1, high = n - 1;
                while(low < high && high < n){
                    int sum = nums[i] + nums[low] + nums[high];
                    if(sum > 0){
                        high--;
                    }else if(sum <0){
                        low++;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        high--;
                        low++;
                        while(low < high && nums[low] == nums[low-1]){
                            low++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
