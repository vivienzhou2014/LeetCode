public class RemoveDuplicatesfromSortedArrayII80 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int write = 1;
        for(int i = 1; i <nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{count = 0;}
            if(count < 2)nums[write++] = nums[i];
        }
        return write;
    }

}
