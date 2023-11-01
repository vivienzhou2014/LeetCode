import java.util.HashMap;

public class DegreeofanArray697 {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                int[] arr = map.get(num);
                arr[0]++;
                arr[2] = i;
                System.out.println(num + "->"+map.get(num)[0]+" "+ map.get(num)[1]+" "+map.get(num)[2]);
            }else{
                map.put(num, new int[]{1,i,i});
                System.out.println(num + "->"+map.get(num)[0]+" "+ map.get(num)[1]+" "+map.get(num)[2]);
            }
        }
        int maxCount = 0, maxLen = 0;
        for(int[] v:map.values()){
            int count = v[0], left = v[1], right = v[2];
            System.out.println(count+ " "+ left + " " +right);
            if(count >= maxCount){
                maxCount = count;
                maxLen = right-left+1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }
}
