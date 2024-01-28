package LeetCodeDailyProblem.DailyStudyPlan.Jan24StudyPlan;

public class KInversePairArray {
    public static void main(String[] args) {
        int n = 3;
        int k = 0;
        System.out.println(kInversePairs(n, k));
    }

    private static int kInversePairs(int n, int k) {
        int [][] dp = new int[n+1][k+1];
        int mod = 1000000007;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= k; j++){
                if(j == 0){
                    dp[i][j] = 1;
                }else{
                    for(int p = 0; p <= Math.min(j, i-1); p++){
                        dp[i][j] = (dp[i][j] + dp[i-1][j-p]) % mod;
                    }
                }
            }
        }
        return dp[n][k];
    }
}
