package AugustBatchProblem.zeta;

public class StockBuyAndSell2 {

    public static void main(String[] args) {
        int [] stocks = {5,2,6,1,4};

        int minSoFar = stocks[0];
        int maxSoFarProfit = 0;

        for(int i =0; i<stocks.length;i++){
            minSoFar = Math.min(minSoFar,stocks[i]);
            int profit = stocks[i]-minSoFar;
            maxSoFarProfit = Math.max(maxSoFarProfit,profit);
        }

        System.out.println(maxSoFarProfit);
    }
}
