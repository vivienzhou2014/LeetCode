public class MaxConsecutiveOnes485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;//use this to record each consecutive 1s
            int maxCount = 0;//use this the record the max consecutive 1s
            for(int i = 0; i < nums.length; i++){//loop through the array
                if(nums[i] == 1){//find out if the number in array is 1
                    count++;//if it is one, record in count and check the next one
                    maxCount = maxCount > count ? maxCount : count;//use this to get the max consecutive 1s
                    //we can also use Math.max() method
                }else{//if the number in array is not 1
                    count = 0;//restart the count but since maxCount is recorded, we are fine
                }
            }
            return maxCount;//return the max consecutive 1s in the array
        }
    }
}
