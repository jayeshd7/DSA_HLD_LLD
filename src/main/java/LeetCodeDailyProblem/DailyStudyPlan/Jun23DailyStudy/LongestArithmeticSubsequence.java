package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class LongestArithmeticSubsequence {
    public static void main(String[] args) {
        int [] nums = {3,6,9,12};
        System.out.println(longestArithSeqLength(nums));
    }

    private static int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int [][] dp = new int[n][20001];
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int diff = nums[i] - nums[j] + 10000;
                dp[i][diff] = Math.max(dp[i][diff], dp[j][diff] + 1);
                max = Math.max(max, dp[i][diff]);
            }
        }
        return max + 1;


    }
}
