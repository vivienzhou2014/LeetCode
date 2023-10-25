import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop1475 {
    public int[] finalPrices1(int[] prices) {
        int n = prices.length;
        int[] discounts = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(prices[j] <= prices[i] && discounts[i] == 0){
                    discounts[i] = prices[j];
                }
            }
            discounts[i] = prices[i] - discounts[i];
        }

        return discounts;
    }
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] discounts = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && prices[i] < stack.peek()){
                stack.pop();
            }
            discounts[i] = stack.isEmpty()?prices[i]:(prices[i]-stack.peek());
            stack.push(prices[i]);
        }

        return discounts;
    }
}
