import java.util.HashSet;
import java.util.PriorityQueue;

public class smallestInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5};
        //System.out.println(findSmallestMissingPositive(arr));
        System.out.println(solution(arr));
    }
    public static int solution(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(A[i]>0){
                set.add(A[i]);
            }
        }
        for (int res = 1; res < Integer.MAX_VALUE; res++) {
            if(!set.contains(res)){
                return res;
            }
        }
        return -1;
    }
    public static int findSmallestMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Move all non-positive numbers to the end of the array
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        // Step 2: Mark positions corresponding to positive elements
        for (int i = j; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n - j) {
                nums[j + num - 1] = -Math.abs(nums[j + num - 1]);
            }
        }

        // Step 3: Find the first index with a positive element
        for (int i = j; i < n; i++) {
            if (nums[i] > 0) {
                return i - j + 1;
            }
        }

        return n - j + 1;
    }


}
