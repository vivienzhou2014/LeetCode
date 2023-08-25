public class RangeSumQuery303 {
    private int[] preNum;

    public NumArray(int[] nums) {
        //create an array to store sum of 0...i
        preNum = new int[nums.length+1];
        for(int i=1; i<preNum.length; i++){
            preNum[i] = preNum[i-1]+nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return preNum[right+1]-preNum[left];
    }
}
