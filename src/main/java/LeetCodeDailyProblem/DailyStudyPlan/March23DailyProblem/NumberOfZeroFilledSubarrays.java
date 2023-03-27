package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class NumberOfZeroFilledSubarrays {
    public static void main(String[] args) {
        int [] nums = {0,0,0,2,0,0};
        System.out.println(countZeroFilledSubarrays(nums));
    }

    private static long countZeroFilledSubarrays(int[] nums) {
        long res = 0;
        int[] dp = new int[nums.length + 1];
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1] == 0) {
                dp[i] = dp[i-1] == 0 ? 1 : dp[i-1] + 1;
            }
            res += dp[i];
        }
        return res;

    }
}
