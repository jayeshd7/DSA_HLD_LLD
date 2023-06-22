package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class BuyAndSellStocksWithTranscationFee {

    public static void main(String[] args) {
        int [] prices = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(maxProfit(prices, fee));
        
    }

    private static int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int buy = prices[0] + fee;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] + fee < buy){
                buy = prices[i] + fee;
            }else if(prices[i] > buy){
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }
}
