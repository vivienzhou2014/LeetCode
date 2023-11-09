public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[] jump = new int[n];
        for(int i = 0; i < n; i++){
            jump[i] = i + nums[i];
        }
        int index = 0, maxJump = jump[0];
        while(index < n && index <= maxJump){
            if(maxJump < jump[index]){
                maxJump = jump[index];
            }
            index++;
        }
        if(maxJump < n - 1) return false;
        return true;
    }
}
