package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;

public class PerfectSquares {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(perfectSquares(n));
    }

    private static int perfectSquares(int n) {
        int [] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            dp[i] = i;
            for(int j = 1; i - j * j >= 0; j++){
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
