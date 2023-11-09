import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int low = j+1, high = n-1;
                while(low < high){
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if(sum < target || (low > j+1 && nums[low] == nums[low-1]) ){
                        low++;
                    }else if(sum > target || (high < n-1 && nums[high] == nums[high+1])){
                        high--;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[low++], nums[high--]));
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        for(List<Integer> list :fourSum(nums, 0)){
            for(int n: list){
                System.out.print(n + " ");
            }
        }
    }
}
