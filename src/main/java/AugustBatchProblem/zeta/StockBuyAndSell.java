package AugustBatchProblem.zeta;

public class StockBuyAndSell {

    public static void main(String[] args) {

        int stocks [] = {5,2,6,1,4,7,3,6};

        int profit = 0;
        for(int i =1; i<stocks.length;i++){
            if(stocks[i] >stocks[i-1]){
                profit += stocks[i]-stocks[i-1];
            }
        }

        System.out.println(profit);
    }
}
