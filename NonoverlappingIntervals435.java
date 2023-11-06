import java.util.Arrays;

public class NonoverlappingIntervals435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2)-> o1[1]-o2[1]);
        int count = 0;
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < end){
                count++;
            }else{
                end = intervals[i][1];
            }
        }
        return count;
    }

}
