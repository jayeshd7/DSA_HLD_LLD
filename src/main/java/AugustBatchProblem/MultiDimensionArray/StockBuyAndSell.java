package AugustBatchProblem.MultiDimensionArray;

public class StockBuyAndSell {

    public static void main(String[] args) {

            int arr[] = {1, 5, 3, 8, 12}, n = 5;

            //System.out.println(solve(arr, 0, n-1));
        System.out.println(efficientSolve(arr, 0, n-1));



    }

    private static int efficientSolve(int[] arr, int start, int end) {
        int profit = 0;

        for(int i =1;i<=end;i++){
            if(arr[i]>arr[i-1]){
                profit = profit + (arr[i]-arr[i-1]);
            }
        }


        return profit;
    }

    private static int solve(int []A, int start, int end) {

        if(end <= start)
            return 0;

        int profit = 0;

        for(int i = start; i < end; i++)
        {
            for(int j = i + 1; j <= end; j++)
            {
                if(A[j] > A[i])
                {
                    int curr_profit = A[j] - A[i]
                            + solve(A, start, i - 1)
                            + solve(A, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }

        return profit;
    }
}
