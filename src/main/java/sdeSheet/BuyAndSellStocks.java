package sdeSheet;

public class BuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println("Maximum profit: " + ans);
    }

    private static int maxProfit(int[] prices) {

        int n = prices.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else {
                maxProfit=Math.max(maxProfit, prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
