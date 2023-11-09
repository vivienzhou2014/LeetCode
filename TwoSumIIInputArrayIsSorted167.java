public class TwoSumIIInputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while(low < high){
            int sum = numbers[low] + numbers[high];
            if(sum >target){
                high--;
            }else if(sum < target){
                low++;
            }else{
                break;
            }
        }
        return new int[]{low+1,high+1};
    }

    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        int low = 0, high = numbers.length - 1;
        while(low < high){
            int sum = numbers[low] + numbers[high];
            if(sum >target){
                high--;
            }else if(sum < target){
                low++;
            }else{
                result[0] = low+1;
                result[1] = high+1;
                return result;
            }
        }
        return result;
    }
}
