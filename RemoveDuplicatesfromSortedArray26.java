public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        int write = 0;
        //move check to see if number equals to previous number
        for(int check = 0;check < nums.length; check++){
            //check == 0 is base case
            if(check == 0 || nums[check] != nums[check - 1]){
                //found a new number, write it to nums
                nums[write] = nums[check];
                //move write to next place to be written
                write++;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] expectedNums = new int[3];
        int k = removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
