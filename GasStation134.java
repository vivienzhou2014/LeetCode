public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curGain = 0, totalGain = 0, station = 0;
        for(int i = 0; i < gas.length; i++){
            curGain += gas[i] - cost[i];
            totalGain += gas[i] - cost[i];

            if(curGain < 0){
                station = i + 1;
                curGain = 0;//遇到gain小于零过不去就重开
            }
        }//总的gain大于等于零则一定有解
        return totalGain >= 0? station :-1;
    }

}
