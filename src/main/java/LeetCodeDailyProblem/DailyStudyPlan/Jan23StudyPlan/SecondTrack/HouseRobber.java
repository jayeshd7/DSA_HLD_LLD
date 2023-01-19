package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
       int [] dp = new int[nums.length+1];
       dp[0] = 0;
       dp[1] = nums[0];
         for(int i = 1; i < nums.length; i++)
         {
              dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]);
         }
            return dp[nums.length];

    }
}
