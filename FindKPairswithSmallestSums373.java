import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairswithSmallestSums373 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> nums1[a[0]]+nums2[a[1]] - (nums1[b[0]]+nums2[b[1]]));
        List<List<Integer>> result = new ArrayList<>();
        for(int row = 0; row < nums1.length; row++){
            int[] pair = {row, 0};
            pq.offer(pair);
        }
        while(k-- > 0 && !pq.isEmpty()){
            int[] pos = pq.poll();
            int i = pos[0];
            int j = pos[1];
            result.add(Arrays.asList(nums1[i], nums2[j]));
            j++;
            if(j < nums2.length){
                int[] pair = {i, j};
                pq.offer(pair);
            }
        }
        return result;
    }


}
