public class CountNumberofNiceSubarrays1248 {
    public static int numberOfSubarrays(int[] nums, int k) {
        int result = 0;
        int n = nums.length;
        int[] odd = new int[n+2];
        odd[0] = -1;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 1){
                count++;
                odd[count] = i;
            }
        }
        odd[++count] = n;
        for(int i = 1; i+k < count+1; i++){
            //System.out.println(odd[i]);
            result += (odd[i] - odd[i-1])*(odd[i+k] - odd[i+k-1]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        System.out.println(numberOfSubarrays(nums,3));
    }
}
