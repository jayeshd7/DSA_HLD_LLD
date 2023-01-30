package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        int n = 3;
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        System.out.println(findCheapestPrice(n,flights,src,dst,k));
    }

    private static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dp = new int[n];
        for(int i = 0;i<n;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[src] = 0;
        for(int i = 0;i<=k;i++){
            int[] temp = new int[n];
            for(int j = 0;j<n;j++){
                temp[j] = dp[j];
            }
            for(int[] f:flights){
                if(dp[f[0]]!=Integer.MAX_VALUE){
                    temp[f[1]] = Math.min(temp[f[1]],dp[f[0]]+f[2]);
                }
            }
            dp = temp;
        }
        return dp[dst]==Integer.MAX_VALUE?-1:dp[dst];
    }
}
