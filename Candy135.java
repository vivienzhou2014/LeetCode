import java.util.Arrays;

public class Candy135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];
        Arrays.fill(candy, 1);//assign every kid a candy first
        //loop to check if the kid on your left has higher rating
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }
        //loop backward to check if the kid on your right has higher rating
        //so we will miss the last one, add the last one first
        int result = candy[n-1];
        for(int i = n-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i], candy[i+1]+ 1);
            }//already checked the left so candy[i] is already candy[i-1]+1,pick the largest one from your left and right candy amount to add 1(because we need to make sure if it is higher rating, they receiver more candies than neighbors)
            result += candy[i];
        }
        return result;
    }
}
