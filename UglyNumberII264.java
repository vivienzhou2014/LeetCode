import java.util.HashSet;
import java.util.PriorityQueue;

public class UglyNumberII264 {
    public int nthUglyNumber(int n) {
        int result = 1;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        int[] factors = {2,3,5};
        pq.offer(1L);
        for(int i = 0; i < n; i++){
            long num = pq.poll();
            result = (int)num;
            for(int factor: factors){
                if(set.add(factor * num)){
                    pq.offer(factor * num);
                }
            }
        }
        return result;
    }

}
