public class SumofAllOddLengthSubarrays1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int[] preSum = new int[arr.length + 1];
        preSum[0] = 0;
        for(int i = 0; i < arr.length; i++){
            preSum[i+1] = preSum[i] + arr[i];
        }
        for(int left = 0; left < preSum.length -1; left++){
            for(int increment = 1; increment < preSum.length; increment +=2){
                int right = left + increment;
                if(right < preSum.length){
                    sum += preSum[right] - preSum[left];
                }
            }
        }
        return sum;
    }
}
