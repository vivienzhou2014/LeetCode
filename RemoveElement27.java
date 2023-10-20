public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        for(int check = 0; check < nums.length; check++){
            if(nums[check] != val){
                nums[write] = nums[check];
                write++;
            }
        }
        return write;
    }
}
